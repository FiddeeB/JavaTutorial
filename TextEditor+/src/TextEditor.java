/*
  Created by fredr on 2016-12-07.
 */
//Imports necessary libraries.
import java.awt.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.FileReader;

class TextEditor extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final Action New = null;
    //Constructs a new empty TextArea with the specified number of rows and columns.
    private final JTextArea area = new JTextArea(20, 120);
    //Constructs a filchooser from user directory
    private final JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
    private String currentFile = "Untitled";
    //Sets boolean to false on variable changed
    private boolean changed = false;

    private TextEditor() {
        //Sets the text area to a font and size
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        //Creates a Vertical and Horizontal scrollbar
        JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //Sets the scrollbar to center
        add(scroll, BorderLayout.CENTER);

        //Adds a graphical menubar
        JMenuBar JMB = new JMenuBar();
        setJMenuBar(JMB);
        //Creates to menu items
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        //Adds the menu items to the menubar
        JMB.add(file);
        JMB.add(edit);

        //Adds submenu items to the file menuitem
        file.add(New);
        file.add(Open);
        file.add(Save);
        file.add(Quit);
        file.add(SaveAs);
        file.addSeparator();

        //Creates a loop i with initial value of 0 and gets repeated until i is 3
        for (int i = 0; i < 4; i++)
            //sets the menu items to the value of i and set the icon to text
            file.getItem(i).setIcon(null);

        //Adds submenu items to the edit menu item.
        edit.add(Cut);
        edit.add(Copy);
        edit.add(Paste);

        //Sets the menuitems to pre chosen order
        edit.getItem(0).setText("Cut");
        edit.getItem(1).setText("Copy");
        edit.getItem(2).setText("Paste");

        //Creates a new toolbar at the north position. adds toolbar options, and adds a seperator
        JToolBar tool = new JToolBar();
        add(tool, BorderLayout.NORTH);
        tool.add(New);
        tool.add(Open);
        tool.add(Save);
        tool.addSeparator();

        //Creates buttons and adds them to the toolbar
        JButton cut = tool.add(Cut), cop = tool.add(Copy), pas = tool.add(Paste);

        cut.setText(null);
        cut.setIcon(new ImageIcon("cut.gif"));
        cop.setText(null);
        cut.setIcon(new ImageIcon("copy.gif"));
        pas.setText(null);
        cut.setIcon(new ImageIcon("paste.gif"));

        Save.setEnabled(false);
        SaveAs.setEnabled(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        area.addKeyListener(k1);
        setTitle(currentFile);
        setVisible(true);
    }

    private KeyListener k1 = new KeyAdapter() {
        public void KeyPressed(KeyEvent e) {
            changed = true;
            Save.setEnabled(true);
            SaveAs.setEnabled(true);
        }
    };
    private final Action SaveAs = new AbstractAction("Save As...") {
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public void actionPerformed(ActionEvent e) {
            saveFileAs();
        }
    };
    private final Action Open = new AbstractAction("Open", new ImageIcon("Open.gif")) {
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public void actionPerformed(ActionEvent e) {
            saveOld();
            if (dialog.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                readInFile(dialog.getSelectedFile().getAbsolutePath());
            }
            SaveAs.setEnabled(true);
        }
    };
    private final Action Save = new AbstractAction("Save", new ImageIcon("save.gif")) {
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public void actionPerformed(ActionEvent e) {
            if (!currentFile.equals("Untitled"))
                saveFileAs();
        }
    };
    private final Action Quit = new AbstractAction("Quit") {
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public void actionPerformed(ActionEvent e) {
            saveOld();
            System.exit(0);
        }
    };
    private final ActionMap m = area.getActionMap();
    private final Action Cut = m.get(DefaultEditorKit.cutAction);
    private final Action Copy = m.get(DefaultEditorKit.copyAction);
    private final Action Paste = m.get(DefaultEditorKit.pasteAction);

    private void saveFileAs() {
        if (dialog.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
            saveFile(dialog.getSelectedFile().getAbsolutePath());
    }

    private void saveOld() {
        if (changed) {
            if (JOptionPane.showConfirmDialog(this, "Would you like to save " + currentFile + " ?", "Save", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                saveFile(currentFile);
        }
    }

    private void readInFile(String fileName) {
        try {
            FileReader r = new FileReader(fileName);
            area.read(r, null);
            r.close();
            currentFile = fileName;
            setTitle(currentFile);
            changed = false;
        } catch (IOException e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "Editor can't find the file called " + fileName);
        }
    }

    private void saveFile(String fileName) {
        try {
            FileWriter w = new FileWriter(fileName);
            area.write(w);
            w.close();
            currentFile = fileName;
            setTitle(currentFile);
            changed = false;
            Save.setEnabled(false);
        }
        //Constructs an IOException with null as its error detail message.
        catch (IOException e) {

        }




}
//Deploys the program with a new texteditor
public static void main(String[] arg) {
    new TextEditor();
}
public void setK1(KeyListener k1) {
    this.k1 = k1;
}
}
