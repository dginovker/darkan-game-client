/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RenderAnimIndexLoader {
	public static RenderAnimDefs aClass227_2669 = new RenderAnimDefs();
	SoftCache aClass229_2670 = new SoftCache(64);
	Index aClass317_2671;
	Defaults6Loader aClass526_2672;
	
	public void method3615(int i, int i_0_) {
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.method3858(i, (byte) 19);
		}
	}

	public RenderAnimDefs getRenderAnimDefs(int i, byte i_1_) {
		RenderAnimDefs class227;
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			class227 = ((RenderAnimDefs) ((RenderAnimIndexLoader) this).aClass229_2670.get((long) i));
		}
		if (class227 != null)
			return class227;
		byte[] is;
		synchronized (((RenderAnimIndexLoader) this).aClass317_2671) {
			is = ((RenderAnimIndexLoader) this).aClass317_2671.getFile(((SharedConfigsType.RENDER_ANIMS.id) * -71319279), i);
		}
		class227 = new RenderAnimDefs();
		((RenderAnimDefs) class227).aClass211_2788 = this;
		if (null != is)
			class227.method3821(new RsByteBuffer(is), -1552501501);
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.put(class227, (long) i);
		}
		return class227;
	}

	public void method3617(int i) {
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.method3859(-2032720796);
		}
	}

	public void method3618(byte i) {
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.method3863(1249794319);
		}
	}

	public void method3619() {
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.method3859(-667955858);
		}
	}

	public RenderAnimDefs method3620(int i) {
		RenderAnimDefs class227;
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			class227 = ((RenderAnimDefs) ((RenderAnimIndexLoader) this).aClass229_2670.get((long) i));
		}
		if (class227 != null)
			return class227;
		byte[] is;
		synchronized (((RenderAnimIndexLoader) this).aClass317_2671) {
			is = ((RenderAnimIndexLoader) this).aClass317_2671.getFile(((SharedConfigsType.RENDER_ANIMS.id) * -71319279), i);
		}
		class227 = new RenderAnimDefs();
		((RenderAnimDefs) class227).aClass211_2788 = this;
		if (null != is)
			class227.method3821(new RsByteBuffer(is), -260429185);
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.put(class227, (long) i);
		}
		return class227;
	}

	public RenderAnimDefs method3621(int i) {
		RenderAnimDefs class227;
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			class227 = ((RenderAnimDefs) ((RenderAnimIndexLoader) this).aClass229_2670.get((long) i));
		}
		if (class227 != null)
			return class227;
		byte[] is;
		synchronized (((RenderAnimIndexLoader) this).aClass317_2671) {
			is = ((RenderAnimIndexLoader) this).aClass317_2671.getFile(((SharedConfigsType.RENDER_ANIMS.id) * -71319279), i);
		}
		class227 = new RenderAnimDefs();
		((RenderAnimDefs) class227).aClass211_2788 = this;
		if (null != is)
			class227.method3821(new RsByteBuffer(is), -882227492);
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.put(class227, (long) i);
		}
		return class227;
	}

	public void method3622(int i) {
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.method3858(i, (byte) 52);
		}
	}

	public RenderAnimIndexLoader(Game class486, Language class495, Index class317, Defaults6Loader class526) {
		((RenderAnimIndexLoader) this).aClass317_2671 = class317;
		((RenderAnimIndexLoader) this).aClass317_2671.filesCount((-71319279 * (SharedConfigsType.RENDER_ANIMS.id)), 357148056);
		((RenderAnimIndexLoader) this).aClass526_2672 = class526;
	}

	public void method3623() {
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.method3859(696350698);
		}
	}

	public void method3624(int i) {
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.method3858(i, (byte) 14);
		}
	}

	public void method3625(int i) {
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.method3858(i, (byte) -36);
		}
	}

	public void method3626(int i) {
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.method3858(i, (byte) 106);
		}
	}

	public void method3627() {
		synchronized (((RenderAnimIndexLoader) this).aClass229_2670) {
			((RenderAnimIndexLoader) this).aClass229_2670.method3863(1229247103);
		}
	}

	static final void sendReportAbusePacket(CS2Executor class527, int i) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_2_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		class527.intStackPtr -= 283782002;
		int i_3_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_4_ = (class527.intStack[1 + 1942118537 * class527.intStackPtr]);
		if (null == string_2_)
			string_2_ = "";
		if (string_2_.length() > 80)
			string_2_ = string_2_.substring(0, 80);
		Class184 class184 = Class468_Sub20.method12807(-837831842);
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4611, class184.isaac, -589637310);
		class282_sub23.buffer.writeByte((ChatLine.getLength(string) + 2 + ChatLine.getLength(string_2_)));
		class282_sub23.buffer.writeString(string);
		class282_sub23.buffer.writeByte(i_3_ - 1);
		class282_sub23.buffer.writeByte(i_4_);
		class282_sub23.buffer.writeString(string_2_);
		class184.method3049(class282_sub23, -187330762);
	}

	static final void method3629(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		if (!Class456_Sub3.method12682(i, null, -1707980188)) {
			if (-1 != i_11_)
				client.aBoolArray7443[i_11_] = true;
			else {
				for (int i_13_ = 0; i_13_ < 107; i_13_++)
					client.aBoolArray7443[i_13_] = true;
			}
		} else
			GroundDecoration.method16094(Class468_Sub8.aClass98Array7889[i].method1616(2127300382), -1, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_11_ < 0, (byte) 6);
	}

	public static void method3630(int i) {
		synchronized (Class236.aQueue2914) {
			for (;;) {
				Class282_Sub53_Sub1 class282_sub53_sub1 = (Class282_Sub53_Sub1) Class236.aQueue2914.poll();
				if (class282_sub53_sub1 == null)
					break;
				class282_sub53_sub1.method13475(-1123290307);
			}
		}
	}

	public static void method3631(int i, int i_14_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(3, (long) i);
		class282_sub50_sub12.method14965((byte) -28);
	}
}