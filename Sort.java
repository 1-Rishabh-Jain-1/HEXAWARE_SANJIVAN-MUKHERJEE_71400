import java.util.*;
public class Sort
{
  public static void main(String []args) 
  {
    Scanner sc = new Scanner(System.in);
    int i, j, temp;
    int arr2[] = new int[20];
    int arr[] = {100,250,150,350,490,560,440};
    int arrl = arr.length;
    System.out.println("Press 1 for Ascending Order:");
    System.out.println("Press 2 for Descending Order:");
    int a = sc.nextInt();
    for (i = 0; i < ( arrl - 1 ); i++) 
    {
      for (j = 0; j < arrl - i - 1; j++) 
      {
        if (arr[j] > arr[j+1]) 
        {
           temp = arr[j];
           arr[j] = arr[j+1];
           arr[j+1] = temp;
        }
      }
    }
    if(a == 1)
    {
        System.out.println("Array sorted in Ascending Order:");
        for (i = 0 ; i < arrl; i++)
        {
            System.out.println(arr[i]);
        }
    }
    else if(a == 2)
    {
        System.out.println("Array sorted in Descending Order:");
        for (i = arrl-1 ; i >= 0; i--) 
        {
            System.out.println(arr[i]);
        }
    }
    else
    {
        System.out.println("WRONG INPUT!!!!");
    }
    System.out.println("Numbers greater than 200:");
    for (i = 0 ; i < arrl; i++)
    {
        if(arr[i]<200)
        {
            continue;
        }
        else
        {
            arr2[i] = arr[i];
        System.out.println(arr2[i]);
        }
    }
}
}