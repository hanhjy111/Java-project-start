import java.util.Scanner;
public class ForControlTest_02 
	{

	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		
		int begin = 0, end = 0, multiple = 0, total = 0;
		int imsi = 0;
		
		System.out.print("���� �� = ");
		begin = in.nextInt();
		
		System.out.print("������ �� = ");
		end = in.nextInt();
		
		System.out.print("��� = ");
		multiple = in.nextInt();


	if(begin > end) 
		{
		imsi = begin;
		begin = end;
		end = imsi;
		}
	
	for(int n = begin; n <= end; ++n)
		{
		if(n % multiple == 0)
			{
			total += n;
			}
		}

	System.out.println();
	System.out.println(begin + " ~ " + end + " ���� �� �� " + 
					multiple + "�� ����� ���� " + total);
	
	
	in.close();
	
		}
	}