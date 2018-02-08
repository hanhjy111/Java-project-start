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

 

	// 프레임 생성 > 다이얼로그 선언 > 사용할 옵션(버튼) 지정

	

	private JFrame frm = new JFrame();

	

	// 메세지 다이얼로그 간련 컴포먼트를 선언

	private JPanel messagePanel = new JPanel();

	private JLabel messageLabel = new JLabel("J옵션 메세지 다이얼로그 예제");

	private JButton questBtn = new JButton("질문");

	private JButton inforBtn = new JButton("정보");

	private JButton warnBtn = new JButton("경고");

	private JButton errorBtn = new JButton("에러");

	

	// 옵션 다이얼로그 관련 컴포넌트 선언

	

	private JPanel optionPanel = new JPanel();

	private JLabel optionLabel = new JLabel("J옵션 옵션 다이얼로그 예제");

	private JButton optionBtn = new JButton("옵션다이얼로그");

	

	

	private JPanel inputPanel = new JPanel();

	private JLabel inputLabel = new JLabel("J옵션 입력 다이얼로그 예제");

	private JButton inputBtn = new JButton("입력다이얼로그");

	

	// 사용자 맞춤형 대화상자 관련 컴포넌트

	

	private JPanel JDialogPanel = new JPanel();

	private JLabel JDialogLabel = new JLabel("JDialog 예제");

	

	

	

	// 사용자 맞춤형 대화상자

	

	private JDialog dialog = new JDialog();

	private JButton JdialogBtn = new JButton("사용자 맞춤");

	private JButton okBtn = new JButton("확인");

	private JButton cancelBtn = new JButton("취소");

	

	

	//

	//

	

	

	// 생성자

	public MyFrame()

	{

		// 메세지 옵션 다이얼로그

		questBtn.addActionListener(this);

		inforBtn.addActionListener(this);

		warnBtn.addActionListener(this);

		errorBtn.addActionListener(this);

		messagePanel.add(messageLabel);

		messagePanel.add(questBtn);

		messagePanel.add(inforBtn);

		messagePanel.add(warnBtn);

		messagePanel.add(errorBtn);

		

		// 옵션 다이얼로그

		optionBtn.addActionListener(this);

		optionPanel.add(optionLabel);

		optionPanel.add(optionBtn);

		

		

		// 입력 다이얼로그

		inputBtn.addActionListener(this);

		inputPanel.add(inputLabel);

		inputPanel.add(inputBtn);

		

		// 사용자 다이얼로그

		JdialogBtn.addActionListener(this);

		JDialogPanel.add(JDialogLabel);

		JDialogPanel.add(JdialogBtn);

		

		// 사용자 다이얼로그 - 자식노드 창

		okBtn.addActionListener(this);

		cancelBtn.addActionListener(this);

		dialog.setLayout(new FlowLayout());

		dialog.add(okBtn);

		dialog.add(cancelBtn);

		

		

		//

		//

		

		

		// 페널 초기화 후 옵션을 세팅 : 화면을 그리드 형태로 분할

		// 그리드 : 표

		frm.setLayout(new GridLayout(4,0));  // 행, 렬

		frm.add(messagePanel);

		

		frm.add(optionPanel); // 옵션 페널

		

		frm.add(inputPanel);  // 입력 페널

		

		frm.add(JDialogPanel); // JDialog

		

		// 프레임 초기화 후 페널을 세팅 : 화면 띄우기

		frm.setTitle("다이얼로그예제");

		frm.setLocation(120, 120);  // 위치

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 버튼

		frm.pack(); // 전체를 하나로 묶어줌

		frm.setVisible(true);   // 창을 뛰울지 여부

		

		

	} // MyFrame

	

	@Override

	public void actionPerformed(ActionEvent e) // e 가 무슨 버튼을 눌렀는지 받는다

	{

		// showMessageDialog(부모창, "라벨", "제목", 아이콘형태);

		// 메세지 옵션 다이얼로그

		if(e.getSource() == questBtn)

		{

			JOptionPane.showMessageDialog(frm,"질문 대화상자", "질문", JOptionPane.QUESTION_MESSAGE); 

			// 질문 누르면 실행되는 창

		}

		else if(e.getSource() == inforBtn)

		{

			JOptionPane.showMessageDialog(frm,"정보 대화상자", "정보", JOptionPane.INFORMATION_MESSAGE );

		}

		else if(e.getSource() == warnBtn)

		{

			JOptionPane.showMessageDialog(frm,"경고 대화상자", "경고", JOptionPane.WARNING_MESSAGE);

		}

		else if(e.getSource() == errorBtn)

		{

			JOptionPane.showMessageDialog(frm,"에러 대화상자", "에러", JOptionPane.ERROR_MESSAGE);

		}

		

		//옵션 다이얼로그

		else if(e.getSource() == optionBtn)

		{

			Object[] options = {"옵션1", "옵션2", "옵션3"};

			int selectedNum;

			//각 옵션을 클릭시 선택되는 값을 숫자로 받아서 담기위한 변수

			int selectedtum = JOptionPane.showOptionDialog(frm, "옵션 다이얼로그 예제", "옵션다이얼로그", JOptionPane.YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null, options, options[0]);            

			

			optionBtn.setText("옵션" + (selectedtum + 1) + "선택됨");

			

		}

		

		// 입력 다이얼로그

		else if(e.getSource() == inputBtn)

		{

			Object[] inputs = {"입력1", "입력2", "입력3"};

			String str = (String)JOptionPane.showInputDialog(frm, "입력 다이얼로그 예제", "입력다이얼로그", JOptionPane.PLAIN_MESSAGE,null, inputs, inputs[0]);

			if(str == null) //null 의미 : 없는

			{

				inputBtn.setText("취소 선택됨");

			}

			else

			{

				inputBtn.setText(str + "이(가) 선택됨");

			}

			// 아니면 이렇게 해도 좋다 : inputBtn.setText(str);

		}

		

		

		// 사용자 정의 다이얼로그

		

		else if(e.getSource() == JdialogBtn)

		{

			dialog.setTitle("사용자 맞춤형");

			dialog.setSize(300,300);

			dialog.setVisible(true); // 선언 되어야 창이 오픈 된다.

			

		}

		

		// 사용자 정의 다이얼로그 - 자식 노드 창

		

		else if(e.getSource() == okBtn)

		{

			

			JdialogBtn.setText("확인 선택");// JdialogBtn 넣는거 주의

			dialog.dispose();

	

		}

			

		else if(e.getSource() == cancelBtn)

		{

			JdialogBtn.setText("취소 선택");

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