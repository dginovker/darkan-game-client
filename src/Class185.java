/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class185 {
	float[] aFloatArray2302;
	float aFloat2303;
	boolean aBool2304;
	float aFloat2305 = 0.85F;
	int anInt2306;
	int anInt2307;
	float aFloat2308;
	boolean aBool2309;
	ChoppyItemFixClass aClass144_2310;
	float aFloat2311;
	int[] anIntArray2312;
	int anInt2313;
	Matrix44Var aClass294_2314;
	float[] aFloatArray2315;
	Matrix44Var aClass294_2316;
	Matrix44Arr aClass384_2317;
	Matrix44Arr aClass384_2318;
	int[] anIntArray2319;
	HardwareRenderer aClass505_Sub3_2320;
	int[] anIntArray2321;
	float[] aFloatArray2322;
	float[] aFloatArray2323;
	float[] aFloatArray2324;
	int[] anIntArray2325;
	float aFloat2326;
	int[] anIntArray2327;
	int[] anIntArray2328;
	int[] anIntArray2329;
	float[] aFloatArray2330;
	float aFloat2331;
	float aFloat2332;
	float aFloat2333;
	boolean aBool2334;
	float aFloat2335;
	int anInt2336;
	int anInt2337;
	float[] aFloatArray2338;
	Class528_Sub2[] aClass528_Sub2Array2339;
	Class528_Sub2[] aClass528_Sub2Array2340;
	float[] aFloatArray2341;
	float[] aFloatArray2342;
	Runnable aRunnable2343;
	float[] aFloatArray2344;
	float[] aFloatArray2345;
	Matrix44Arr aClass384_2346;

	void method3070(Runnable runnable, int i) {
		((Class185) this).aRunnable2343 = runnable;
	}

	void method3071(int i) {
		((Class185) this).aClass144_2310 = new ChoppyItemFixClass(((Class185) this).aClass505_Sub3_2320, this);
	}

	Class185(HardwareRenderer class505_sub3) {
		((Class185) this).aFloat2303 = 1.0F - ((Class185) this).aFloat2305;
		((Class185) this).anInt2307 = 0;
		((Class185) this).anInt2336 = 0;
		((Class185) this).aBool2309 = false;
		((Class185) this).anInt2306 = 0;
		((Class185) this).anInt2313 = 0;
		((Class185) this).aBool2334 = true;
		((Class185) this).aClass384_2346 = new Matrix44Arr();
		((Class185) this).aClass294_2314 = new Matrix44Var();
		((Class185) this).aClass294_2316 = new Matrix44Var();
		((Class185) this).aClass384_2317 = new Matrix44Arr();
		((Class185) this).aClass384_2318 = new Matrix44Arr();
		((Class185) this).anIntArray2319 = new int[Class528_Sub2.anInt8644];
		((Class185) this).aFloatArray2302 = new float[Class528_Sub2.anInt8644];
		((Class185) this).aFloatArray2341 = new float[Class528_Sub2.anInt8644];
		((Class185) this).aFloatArray2322 = new float[Class528_Sub2.anInt8644];
		((Class185) this).aFloatArray2323 = new float[Class528_Sub2.anInt8644];
		((Class185) this).anIntArray2321 = new int[8];
		((Class185) this).anIntArray2325 = new int[8];
		((Class185) this).anIntArray2312 = new int[8];
		((Class185) this).anIntArray2327 = new int[10000];
		((Class185) this).anIntArray2328 = new int[10000];
		((Class185) this).aFloat2311 = 1.0F;
		((Class185) this).aFloat2335 = 0.0F;
		((Class185) this).aFloat2308 = 1.0F;
		((Class185) this).aFloatArray2338 = new float[2];
		((Class185) this).aClass528_Sub2Array2339 = new Class528_Sub2[7];
		((Class185) this).aClass528_Sub2Array2340 = new Class528_Sub2[7];
		((Class185) this).aFloatArray2315 = new float[64];
		((Class185) this).aFloatArray2342 = new float[64];
		((Class185) this).aFloatArray2330 = new float[64];
		((Class185) this).aFloatArray2344 = new float[64];
		((Class185) this).aFloatArray2345 = new float[64];
		((Class185) this).aFloatArray2324 = new float[3];
		((Class185) this).aClass505_Sub3_2320 = class505_sub3;
		((Class185) this).aClass144_2310 = new ChoppyItemFixClass(class505_sub3, this);
		for (int i = 0; i < 7; i++) {
			((Class185) this).aClass528_Sub2Array2339[i] = new Class528_Sub2(((Class185) this).aClass505_Sub3_2320);
			((Class185) this).aClass528_Sub2Array2340[i] = new Class528_Sub2(((Class185) this).aClass505_Sub3_2320);
		}
		((Class185) this).anIntArray2329 = new int[Class528_Sub2.anInt8562];
		for (int i = 0; i < Class528_Sub2.anInt8562; i++)
			((Class185) this).anIntArray2329[i] = -1;
	}

	public static void method3077(int i) {
		for (int i_0_ = 0; i_0_ < -458827259 * Class260.anInt3219; i_0_++) {
			Class268 class268 = Class260.aClass268Array3232[i_0_];
			if (3 == ((Class268) class268).aByte3300)
				Class58.method1142(class268, 1716467770);
		}
	}

	static final void method3078(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 198501911) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1389 = Class351.method6193(string, class527, 81409636);
		class118.aBool1384 = true;
	}

	static final void method3079(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub22_8213, ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) == 1) ? 1 : 0, -1510347468);
		Class190.method3148((byte) 119);
		Class94.method1589((short) 255);
		client.aBool7175 = false;
	}

	static final void method3080(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, false, 2, class527, (byte) -57);
	}
}
