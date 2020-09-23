/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bucket = sc.nextInt();
		int flow_rate = sc.nextInt();
		int iterations = sc.nextInt();
		int[] arr=new int[iterations];
		for (int i=0;i<iterations;i++){
		    arr[i]=sc.nextInt();
		}
		int bucket_size=0,packet_drop=0,sent=0,left=0;
		for(int i=0;i<iterations;i++){
		    bucket_size+=arr[i];
		    if (bucket_size>bucket){
		        packet_drop=bucket_size-bucket;
		    }
		    else {
		        packet_drop=0;
		    }
		    if (bucket_size>flow_rate){
		        sent=flow_rate;
		    }
		    else {
		        sent=bucket_size;
		    }
		    left = bucket_size - packet_drop-sent;
		    System.out.printf("%d\t %d\t %d\t %d\t %d\n", arr[i],bucket_size,packet_drop,sent,left);
		    bucket_size=left;
		}
		while(true){
		    if (left<=0){
		        break;
		    }
		    int j=0;
		    packet_drop=bucket_size-bucket;
		    if (bucket_size>flow_rate){
		        sent=flow_rate;
		    }
		    else {
		        sent=bucket_size;
		    }
		    left=bucket_size - packet_drop - sent;
		    System.out.printf("%d\t %d\t %d\t %d\t %d\n", j,bucket_size,packet_drop,sent,left);
		    bucket_size=left;
		}
		
	}
}
