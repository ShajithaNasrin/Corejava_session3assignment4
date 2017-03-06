class Student
{
	void Student()
	{
		
		int i;
		System.out.print("Enter No. of students: ");	
		int n= Integer.parseInt(System.console().readLine()); 	//reading data from runtime
		int m[]=new int[n];
		String s[]=new String[n];
		for(i=0;i<n;i++)	//loop for taking details according to the runtime
		{
			System.out.print("Enter "+ (i+1) +" Student Name: ");
			s[i]= System.console().readLine();

			System.out.print("Enter "+ (i+1) +" student Mark: ");
			m[i]= Integer.parseInt(System.console().readLine());
		}
		for(int j=0;j<n;j++) 	//loop for reading a input
		{
			if (m[j]>=40)	//checking the marks from input for validate qualified or failed
			{
				System.out.println(s[j]+" is Qualified");
			}
			else
			{
				System.out.println(s[j]+" is Failed");
			}
		}
	}
	
}
class StudentResult
{
	public static void main(String[] arg)
	{
		Student st=new Student();
		st.Student();					
	}
}
