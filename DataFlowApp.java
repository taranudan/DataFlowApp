  // main class
public class DataFlowApp {
      public static void main(String[] args) {
    	  byte numberByte = 22;
    	  short numberShort = 129;
    	  int numberInt1 = 45, numberInt2 = 130, numberInt3 = 32_800;
    	  double numberDouble1 = 44.55, numberDouble2 = 2147483700.77, numberDouble3 = 1.5;
    	  
    	  System.out.println("integerToByte: " + numberInt1 + " --> " + DataTransformer.integerToByte(numberInt1));
    	  System.out.println("integerToByte: " + numberInt2 + " --> " + DataTransformer.integerToByte(numberInt2));
    	  System.out.println("byteToInteger: " + numberByte + " --> " + DataTransformer.byteToInteger(numberByte));
    	  System.out.println("doubleToInteger: " + numberDouble1 + " --> " + DataTransformer.doubleToInteger(numberDouble1));
    	  System.out.println("doubleToInteger: " + numberDouble2 + " --> " + DataTransformer.doubleToInteger(numberDouble2));
    	  System.out.println("integerToDouble: " + numberInt1 + " --> " + DataTransformer.integerToDouble(numberInt1));
    	  System.out.println("shortToInteger: " + numberShort + " --> " + DataTransformer.shortToInteger(numberShort));
    	  System.out.println("integerToShort: " + numberInt2 + " --> " + DataTransformer.integerToShort(numberInt2));
    	  System.out.println("integerToShort: " + numberInt3 + " --> " + DataTransformer.integerToShort(numberInt3));
    	  System.out.println("doubleToShort: " + numberDouble3 + " --> " + DataTransformer.doubleToShort(numberDouble3));
    	  
      }
}

// secondary class
class DataTransformer {
	static final int minByte = -128;
	static final int maxByte = 127;
	static final int minShort = -32_768;
	static final int maxShort = 32_767;
	static final double minInt = -2_147_483_648;
	static final double maxInt = 2_147_483_647;
	static final double minDoubleShort = -32_768.0;
	static final double maxDoubleShort = 32_767.0;
	
	static byte integerToByte(int value) {
		if (value < minByte || value > maxByte) {
			System.err.println("WARNING! the value \"" + value + "\" overflows \"byte\" range. DATA will was lost!");
			return 0;
		}
		else {
			return (byte)value;
		}
	}
	static int byteToInteger(byte value) {
		return (int)value;
	}
	static int doubleToInteger(double value) {
		if (value < minInt || value > maxInt) {
			System.err.println("WARNING! the value \"" + value + "\" overflows \"int\" range. DATA will was lost!");
			return 0;
		}
		else {
			return (int)value;
		}	
	}
	static double integerToDouble(int value) {
		return (double)value;
	}
	static int shortToInteger(short value) {
		return (int)value;
	}
	static short integerToShort(int value) {
		if (value < minShort || value > maxShort) {
			System.err.println("WARNING! the value \"" + value + "\" overflows \"short\" range. DATA will was lost!");
			return 0;
		}
		else {
			return (short)value;
			}		
	}
	
	static short doubleToShort(double value) {
		if (value < minDoubleShort || value > maxDoubleShort) {
			System.err.println("WARNING! the value \"" + value + "\" overflows \"short\" range. DATA will was lost!");
			return 0;
		}
		else {
			return (short)value;
			}		
	}

}