import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		int arr[] = {2, 4, 6};
        modify1(arr);
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
	}
	
	static void modify1(int array[]) {
        array[0] = 1;
array[1] = 3;
        array[2] = 5;
    }
	
}
