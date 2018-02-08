package dialog;

 

import java.awt.Dialog;

import java.awt.FlowLayout;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

 

import javax.swing.JButton;

import javax.swing.JDialog;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

 

class MyFrame implements ActionListener

{

 

	private static final int QUESTION_MESSAGE = 0;

 

	// ������ ���� > ���̾�α� ���� > ����� �ɼ�(��ư) ����

	

	private JFrame frm = new JFrame();

	

	// �޼��� ���̾�α� ���� ������Ʈ�� ����

	private JPanel messagePanel = new JPanel();

	private JLabel messageLabel = new JLabel("J�ɼ� �޼��� ���̾�α� ����");

	private JButton questBtn = new JButton("����");

	private JButton inforBtn = new JButton("����");

	private JButton warnBtn = new JButton("���");

	private JButton errorBtn = new JButton("����");

	

	// �ɼ� ���̾�α� ���� ������Ʈ ����

	

	private JPanel optionPanel = new JPanel();

	private JLabel optionLabel = new JLabel("J�ɼ� �ɼ� ���̾�α� ����");

	private JButton optionBtn = new JButton("�ɼǴ��̾�α�");

	

	

	private JPanel inputPanel = new JPanel();

	private JLabel inputLabel = new JLabel("J�ɼ� �Է� ���̾�α� ����");

	private JButton inputBtn = new JButton("�Է´��̾�α�");

	

	// ����� ������ ��ȭ���� ���� ������Ʈ

	

	private JPanel JDialogPanel = new JPanel();

	private JLabel JDialogLabel = new JLabel("JDialog ����");

	

	

	

	// ����� ������ ��ȭ����

	

	private JDialog dialog = new JDialog();

	private JButton JdialogBtn = new JButton("����� ����");

	private JButton okBtn = new JButton("Ȯ��");

	private JButton cancelBtn = new JButton("���");

	

	

	//

	//

	

	

	// ������

	public MyFrame()

	{

		// �޼��� �ɼ� ���̾�α�

		questBtn.addActionListener(this);

		inforBtn.addActionListener(this);

		warnBtn.addActionListener(this);

		errorBtn.addActionListener(this);

		messagePanel.add(messageLabel);

		messagePanel.add(questBtn);

		messagePanel.add(inforBtn);

		messagePanel.add(warnBtn);

		messagePanel.add(errorBtn);

		

		// �ɼ� ���̾�α�

		optionBtn.addActionListener(this);

		optionPanel.add(optionLabel);

		optionPanel.add(optionBtn);

		

		

		// �Է� ���̾�α�

		inputBtn.addActionListener(this);

		inputPanel.add(inputLabel);

		inputPanel.add(inputBtn);

		

		// ����� ���̾�α�

		JdialogBtn.addActionListener(this);

		JDialogPanel.add(JDialogLabel);

		JDialogPanel.add(JdialogBtn);

		

		// ����� ���̾�α� - �ڽĳ�� â

		okBtn.addActionListener(this);

		cancelBtn.addActionListener(this);

		dialog.setLayout(new FlowLayout());

		dialog.add(okBtn);

		dialog.add(cancelBtn);

		

		

		//

		//

		

		

		// ��� �ʱ�ȭ �� �ɼ��� ���� : ȭ���� �׸��� ���·� ����

		// �׸��� : ǥ

		frm.setLayout(new GridLayout(4,0));  // ��, ��

		frm.add(messagePanel);

		

		frm.add(optionPanel); // �ɼ� ���

		

		frm.add(inputPanel);  // �Է� ���

		

		frm.add(JDialogPanel); // JDialog

		

		// ������ �ʱ�ȭ �� ����� ���� : ȭ�� ����

		frm.setTitle("���̾�α׿���");

		frm.setLocation(120, 120);  // ��ġ

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ��ư

		frm.pack(); // ��ü�� �ϳ��� ������

		frm.setVisible(true);   // â�� �ٿ��� ����

		

		

	} // MyFrame

	

	@Override

	public void actionPerformed(ActionEvent e) // e �� ���� ��ư�� �������� �޴´�

	{

		// showMessageDialog(�θ�â, "��", "����", ����������);

		// �޼��� �ɼ� ���̾�α�

		if(e.getSource() == questBtn)

		{

			JOptionPane.showMessageDialog(frm,"���� ��ȭ����", "����", JOptionPane.QUESTION_MESSAGE); 

			// ���� ������ ����Ǵ� â

		}

		else if(e.getSource() == inforBtn)

		{

			JOptionPane.showMessageDialog(frm,"���� ��ȭ����", "����", JOptionPane.INFORMATION_MESSAGE );

		}

		else if(e.getSource() == warnBtn)

		{

			JOptionPane.showMessageDialog(frm,"��� ��ȭ����", "���", JOptionPane.WARNING_MESSAGE);

		}

		else if(e.getSource() == errorBtn)

		{

			JOptionPane.showMessageDialog(frm,"���� ��ȭ����", "����", JOptionPane.ERROR_MESSAGE);

		}

		

		//�ɼ� ���̾�α�

		else if(e.getSource() == optionBtn)

		{

			Object[] options = {"�ɼ�1", "�ɼ�2", "�ɼ�3"};

			int selectedNum;

			//�� �ɼ��� Ŭ���� ���õǴ� ���� ���ڷ� �޾Ƽ� ������� ����

			int selectedtum = JOptionPane.showOptionDialog(frm, "�ɼ� ���̾�α� ����", "�ɼǴ��̾�α�", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);            

			

			optionBtn.setText("�ɼ�" + (selectedtum + 1) + "���õ�");

			

		}

		

		// �Է� ���̾�α�

		else if(e.getSource() == inputBtn)

		{

			Object[] inputs = {"�Է�1", "�Է�2", "�Է�3"};

			String str = (String)JOptionPane.showInputDialog(frm, "�Է� ���̾�α� ����", "�Է´��̾�α�", JOptionPane.PLAIN_MESSAGE,null, inputs, inputs[0]);

			if(str == null) //null �ǹ� : ����

			{

				inputBtn.setText("��� ���õ�");

			}

			else

			{

				inputBtn.setText(str + "��(��) ���õ�");

			}

			// �ƴϸ� �̷��� �ص� ���� : inputBtn.setText(str);

		}

		

		

		// ����� ���� ���̾�α�

		

		else if(e.getSource() == JdialogBtn)

		{

			dialog.setTitle("����� ������");

			dialog.setSize(300,300);

			dialog.setVisible(true); // ���� �Ǿ�� â�� ���� �ȴ�.

			

		}

		

		// ����� ���� ���̾�α� - �ڽ� ��� â

		

		else if(e.getSource() == okBtn)

		{

			

			JdialogBtn.setText("Ȯ�� ����");// JdialogBtn �ִ°� ����

			dialog.dispose();

	

		}

			

		else if(e.getSource() == cancelBtn)

		{

			JdialogBtn.setText("��� ����");

			dialog.dispose();

		}

	}//End actionPerformed

	

}//End MyFrame

 

public class Dialogexam 

{

 

	public static void main(String[] args) 

	{

		

 

		MyFrame mf = new MyFrame();

		

		

	} //End main

 

} // End main class