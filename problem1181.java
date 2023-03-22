package algorithm1;

import java.util.ArrayList;
import java.util.Scanner;
 
 
public class problem1181 {
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
 
		int num = sc.nextInt();
		String[] arr = new String[num];
 
		sc.nextLine();	
 
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextLine();
		}
		
		ArrayList list = new ArrayList();
		ArrayList lengthlist = new ArrayList();
		
		for(int i = 0; i < num; i++) {
			if(!list.contains(arr[i])) {
				lengthlist.add(arr[i].length());
				list.add(arr[i].length());
				
			}
		}
		
		int numsz = lengthlist.size();
		int [] length = new int[numsz];
		
		for(int i = 0; i < numsz; i++) {
			length[i] = Integer.parseInt(lengthlist.get(i).toString());
		}
		
		for(int i = 0; i <numsz; i++) {
			arr[i] = list.get(i).toString();
		}
		
		for(int i = 0; i<numsz; i++) {
			for(int x = i+1; x<numsz; x++){
				if(length[i] > length[x]) {
					int temp = length[i];
					length[i] = length[x];
					length[x] = temp;
					
					String stringtemp = arr[i];
					arr[i] = arr[x];
					arr[x] = stringtemp;
				}
				else if(length[i] == length[x]) {
					for(int z = 0; z < length[i];) {
						if(arr[i].charAt(z) > arr[x].charAt(z)){
							String temp = arr[i];
							arr[i] = arr[x];
							arr[x] = temp;
							break;
						}
						else if (arr[i].charAt(z) == arr[i].charAt(z)) {
							z++;
						}
						else {
							break;
						}
					}
				}
			}
		}
		for (int print = 0; print<numsz; print++) {
			System.out.println(arr[print]);
			
			sc.close();
		}
	}
 
}