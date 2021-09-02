package formatExample;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		
		double number = 5577669.88;
		
		// 0은 자릿수를 다 차지하고 표식을 하는 반면 
		// #은 표현은 다 하되 자리가 없는 곳에서는 표시가 안됨
		DecimalFormat dfFormat = new DecimalFormat("0");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("0.0");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("00000000000.000000");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("#");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("#.#");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("#######.######");
		System.out.println(dfFormat.format(number));
		
		dfFormat = new DecimalFormat("#,###.00");
		System.out.println(dfFormat.format(number));
		
		
		
	}

}
