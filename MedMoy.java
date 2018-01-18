import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.util.*;
public class MedMoy {

	public static void main(String[] args) {
		int[] list = {1,2,546,35,1};
		//System.out.println(Moy(list));
		int[] nb = {0};
		int[] moi = Liste(list, 5);
		for(int i = 0; i < moi.length; ++i){
			System.out.print(moi[i] + " ");
		}
		System.out.println();
		System.out.println(Median(moi));
		MyFrame.init();
	}
	
	public static int[] Liste(int[] nb, int num){
		int [] nb2 = new int[nb.length + 1];
		for(int i = 0; i < nb.length; ++i){
			nb2[i] = nb[i];
		}
		nb2[nb.length] = num;
		return nb2;
	}
	
	public static int Moy(int[] nb){
		int res = nb[0];
		for(int i = 1; i < nb.length; ++i){
			res += nb[i];
		}
		return res/nb.length;
	}
	
	public static int Median(int[] nb){
		int mil = nb.length/2;
		return nb[mil-1];
	}
	

}
