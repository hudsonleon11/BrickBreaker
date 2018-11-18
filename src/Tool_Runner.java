import java.util.Arrays;

public class Tool_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//$HL.println("Hello");
		//$HL.pause(1000);
		//$HL.println("blue");
		String result = $HL.front3("Java");
		$HL.println(result);
		String result2 = $HL.front3("po");
		$HL.println(result2);
		String result4 = $HL.front3("P");
		$HL.println(result4);
		String result3 = $HL.delDel("cdel");
		$HL.println(result3);
		String result5 = $HL.delDel("del");
		$HL.println(result5);
		String result6 = $HL.delDel("deldye");
		$HL.println(result6);
		String result7 = $HL.delDel("a");
		$HL.println(result7);
		// NOTE: Was unable to successfully error check the code below, sorry
		//String[] result8 = $HL.biggerTwo(["cat","fish"],["a","be"]);
		//$HL.println(result8);
		//String[] result9 = $HL.biggerTwo(["super","sonic"],["monkey","bears"]);
		//$HL.println(Arrays.toString(result9));
		//String[] result10 = $HL.biggerTwo(["mock","ing"],["bird","yah!"])
		//$HL.println(Arrays.toString(result10));
		//int[] result11 = $HL.middleWay([1,2,3], [4,5,6])
		//$HL.println(Arrays.toString(result11));
		//int[] result12 = $HL.middleWay([4,7,8,9,2], [7,8,9,9,55,21,2])
		//$HL.println(Arrays.toString(result12));
		//int[] result13 = $HL.middleWay([2,3,5,6,7,89,8,5,9], [1,2,3,4,5,6,7,8,99])
		//$HL.println(Arrays.toString(result13));
		$HL.drawBox(5,5);
		
	}
	
}