import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
//N�dv�ndiga Klasser som importeras



public class TextEditor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Action New = null; //Skapar ett nytt document
	private JTextArea area = new JTextArea(20,120); //Arbetsomr�det i programmet
	private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir")); //V�lja fil
	private String currentFile = "Untitled"; //
	private boolean changed = false;

public TextEditor() {
				area.setFont(new Font("Monospaced",Font.PLAIN,12)); //S�tter fonten till Monospaced med textstorlek 12
				JScrollPane scroll = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); //L�gger in en vertikal och horisontal scrollbar som alltid ska visas
				add(scroll,BorderLayout.CENTER); //S�ger var scrollbaren ska ligga. I detta fallet Center
				
				JMenuBar JMB = new JMenuBar(); //L�gger till en Meny
				setJMenuBar(JMB); 
				JMenu file = new JMenu("File"); //L�gger till en meny knapp som kallas File
				JMenu edit = new JMenu("Edit"); //L�gger till en meny knapp som kallas EDit
				JMB.add(file); JMB.add(edit); //L�gger till meny p� slutet av menyn

file.add(New);file.add(Open);file.add(Save); //L�gger till vilka sub-meny alternativ som ska finnas under file
				file.add(Quit);file.add(SaveAs); //Samma som ovan
				file.addSeparator(); //L�gger till en separator efter menyn
				
				for(int i=0; i<4; i++) //Loop som s�ger att om i �r 0 och att i �r loopen ska upprepas om i �r mindre �n 4. F�r varje loop s� �kas i med 1
					file.getItem(i).setIcon(null); 
				
				edit.add(Cut);edit.add(Copy);edit.add(Paste); //L�gger till alternativ i sub-menyn Edit
				
				edit.getItem(0).setText("Cut Out"); //S�ger att CutOut ska vara f�rst i listan och att alternativet ska visas med texten Cutout
				edit.getItem(1).setText("Copy"); // Copy ska vara nummer 2 i listan text ska vara Copy
				edit.getItem(2).setText("Paste"); // Paste ska vara nummer 3 i listan oh text ska vara paste

JToolBar tool = new JToolBar(); //L�gger till en toolbar
				add(tool,BorderLayout.NORTH); //S�ger att toolbaren ska ligga i NORTH
				tool.add(New);tool.add(Open);tool.add(Save); //S�ger att vad toolbaren ska ha f�r alternativ
				tool.addSeparator(); //L�gger till en separator
				
				JButton cut = tool.add(Cut), cop = tool.add(Copy),pas = tool.add(Paste); //L�gger till knappar under menyn
				
				cut.setText(null); cut.setIcon(new ImageIcon("cut.gif")); //S�ger vilken bild som ska visas vid varje knapp och s�ger att det inte ska visas n�gon text
				cop.setText(null); cop.setIcon(new ImageIcon("copy.gif")); //Samma som ovan
				pas.setText(null); pas.setIcon(new ImageIcon("paste.gif")); //Samma som ovan
				
				Save.setEnabled(false); //??
				SaveAs.setEnabled(false); //??
				
				setDefaultCloseOperation(EXIT_ON_CLOSE); //S�ger vad som ska h�nda n�r anv�ndaren st�nger programmet
				pack(); //Anpassar f�nstrett f�r att alla funktioner ska f� plats i det
				area.addKeyListener(k1); //G�r s� att man kan anv�nda tangentbord i "area"
				setTitle(currentFile); //S�tter titeln p� f�nstret till titeln p� filen man anv�nder
				setVisible(true); 
}
private KeyListener k1 = new KeyAdapter() {
	public void keyPressed(KeyEvent e) {
		changed = true;
		Save.setEnabled(true);
		SaveAs.setEnabled(true);
	}
};
Action SaveAs = new AbstractAction("Save as...") { //G�r s� att knappen SaveAs g�r n�got n�r man trycker p� det
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {  //Sparar filen om n�gon klickar p� knappen
		saveFileAs();
	}
};
Action Open = new AbstractAction("Open", new ImageIcon("open.gif")) { //Samma som p� p� Saveas men h�r s�ger den att det finns en bild
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {
		saveOld();
		if(dialog.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) { 
			readInFile(dialog.getSelectedFile().getAbsolutePath()); //�ppnar en ruta med en filutforskare
		}
		SaveAs.setEnabled(true);
	}
};
Action Save = new AbstractAction("Save", new ImageIcon("save.gif")) { //Samma som ovan
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) { //Utf�r uppgiften
		if(!currentFile.equals("Untitled")) //G�r en if loop som s�ger att om filens titel �r of�r�ndrad s� sparas filen 
			saveFile(currentFile);
		else //S�ger att om filen inte har samma namn som sin tidigare version s� andv�nds saveFileAs
			saveFileAs();
	}
};				
Action Quit = new AbstractAction("Quit") { //S�ger vad som ska h�nda n�r man klickar p� quit
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {
		saveOld(); //Sparar det man g�r
		System.exit(0); //S�ger att den ska st�nga ner allt
	}
};
ActionMap m = area.getActionMap(); //S�ger var i programmet som kommande actions ska verka i
	Action Cut = m.get(DefaultEditorKit.cutAction); //G�r s� att ctrl x fungerar
	Action Copy = m.get(DefaultEditorKit.copyAction);  //G�r s� att ctrl c fungerar
	Action Paste = m.get(DefaultEditorKit.pasteAction); //G�r s� att ctrl v fungerar

private void saveFileAs() { //�ppnar en filutforskare
	if(dialog.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
		saveFile(dialog.getSelectedFile().getAbsolutePath());
}
private void saveOld() { //Om titeln och platsen �r of�r�ndrad s� sparas den bara
	if(changed) { //Om den �r f�r�ndrad h�nder kommande
		if(JOptionPane.showConfirmDialog(this, "Would you like to save "+ currentFile +" ?","Save",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
			saveFile(currentFile); //�ppnar en ruta som fr�gar om filen ska byta namn med ja och nej alternativ
	}
	
}
private void readInFile(String fileName) {
	try {
		FileReader r = new FileReader(fileName); //Skapar en fill�sare
		area.read(r, null); //s�ger att fill�sare ska vara i omr�det area 
		r.close(); 
		currentFile = fileName; 
		setTitle(currentFile);
		changed = false;
	}
	catch(IOException e) {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(this,"Editor can't find the file called "+fileName);	//L�gger till en exception f�r ett fel som har intr�ffat. I detta fallet finns inte filen	
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
	catch(IOException e) {		
	}
}
public static void main(String[] arg) { //S�ger vad som ska h�nda n�r programmet �ppnas
	new TextEditor();
}
public KeyListener getK1() { 
	return k1;
}
public void setK1(KeyListener k1) {
	this.k1 = k1;
}
				
				
				
}


