import java.util.LinkedList;
import java.util.Queue;

public class Class534_Sub1 extends Class534 {

	Queue aQueue7921 = new LinkedList();

	int method11424() {
		return 1;
	}

	void method12809(MouseRecord_Sub1 class282_sub53_sub1_1) {
		this.aQueue7921.add(class282_sub53_sub1_1);
		if (this.aQueue7921.size() > 10) {
			this.aQueue7921.poll();
		}
	}

	void method11414() {
		MouseRecord_Sub1 class282_sub53_sub1_2 = (MouseRecord_Sub1) this.aQueue7921.poll();
		if (class282_sub53_sub1_2 != null) {
			TCPPacket tcpmessage_3 = Class271.createPacket(ClientPacket.MOUSE_BUTTON_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
			tcpmessage_3.buffer.writeIntLE(class282_sub53_sub1_2.getX() | class282_sub53_sub1_2.getY() << 16);
			tcpmessage_3.buffer.writeByte128(class282_sub53_sub1_2.method14730() << 1 | class282_sub53_sub1_2.method14729() & 0x1);
			tcpmessage_3.buffer.writeShortLE(this.method11408(class282_sub53_sub1_2, 65535, 1958251581));
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
			class282_sub53_sub1_2.cache();
		}
	}

	void method12810(RsByteBuffer rsbytebuffer_1, MouseRecord_Sub1 class282_sub53_sub1_2, byte b_3) {
		rsbytebuffer_1.writeByte(class282_sub53_sub1_2.method14729());
	}

	boolean method11423() {
		return !this.aQueue7921.isEmpty() || this.aLong7076 < Utils.time() - 2000L;
	}

	int method11412() {
		return 1;
	}

	void method11427(RsByteBuffer rsbytebuffer_1, MouseRecord class282_sub53_2) {
		this.method12810(rsbytebuffer_1, (MouseRecord_Sub1) class282_sub53_2, (byte) 72);
	}

	void method11426(RsByteBuffer rsbytebuffer_1, MouseRecord class282_sub53_2) {
		this.method12810(rsbytebuffer_1, (MouseRecord_Sub1) class282_sub53_2, (byte) 80);
	}

	void method11431() {
		MouseRecord_Sub1 class282_sub53_sub1_1 = (MouseRecord_Sub1) this.aQueue7921.poll();
		if (class282_sub53_sub1_1 != null) {
			TCPPacket tcpmessage_2 = Class271.createPacket(ClientPacket.MOUSE_BUTTON_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
			tcpmessage_2.buffer.writeIntLE(class282_sub53_sub1_1.getX() | class282_sub53_sub1_1.getY() << 16);
			tcpmessage_2.buffer.writeByte128(class282_sub53_sub1_1.method14730() << 1 | class282_sub53_sub1_1.method14729() & 0x1);
			tcpmessage_2.buffer.writeShortLE(this.method11408(class282_sub53_sub1_1, 65535, 2099731488));
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
			class282_sub53_sub1_1.cache();
		}
	}

	void method11418() {
		MouseRecord_Sub1 class282_sub53_sub1_1 = (MouseRecord_Sub1) this.aQueue7921.poll();
		if (class282_sub53_sub1_1 != null) {
			TCPPacket tcpmessage_2 = Class271.createPacket(ClientPacket.MOUSE_BUTTON_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
			tcpmessage_2.buffer.writeIntLE(class282_sub53_sub1_1.getX() | class282_sub53_sub1_1.getY() << 16);
			tcpmessage_2.buffer.writeByte128(class282_sub53_sub1_1.method14730() << 1 | class282_sub53_sub1_1.method14729() & 0x1);
			tcpmessage_2.buffer.writeShortLE(this.method11408(class282_sub53_sub1_1, 65535, -352975879));
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
			class282_sub53_sub1_1.cache();
		}
	}

	boolean method11434() {
		return !this.aQueue7921.isEmpty() || 2966128844247041579L * this.aLong7076 * 1203484888895588483L < Utils.time() - 2000L;
	}

	TCPPacket method11416() {
		return Class271.createPacket(ClientPacket.MOVE_MOUSE, client.GAME_CONNECTION_CONTEXT.isaac);
	}

	TCPPacket method11420() {
		return Class271.createPacket(ClientPacket.MOVE_MOUSE, client.GAME_CONNECTION_CONTEXT.isaac);
	}

	TCPPacket method11428() {
		return Class271.createPacket(ClientPacket.MOVE_MOUSE, client.GAME_CONNECTION_CONTEXT.isaac);
	}

	TCPPacket method11422() {
		return Class271.createPacket(ClientPacket.MOVE_MOUSE, client.GAME_CONNECTION_CONTEXT.isaac);
	}

	int method11415() {
		return 1;
	}

	int method11425() {
		return 1;
	}

	void method11413(RsByteBuffer rsbytebuffer_1, MouseRecord class282_sub53_2) {
		this.method12810(rsbytebuffer_1, (MouseRecord_Sub1) class282_sub53_2, (byte) 110);
	}

	TCPPacket method11421() {
		return Class271.createPacket(ClientPacket.MOVE_MOUSE, client.GAME_CONNECTION_CONTEXT.isaac);
	}

	static int[] method12815(CacheableNode_Sub7 class282_sub50_sub7_0, int i_1) {
		int[] quests = null;
		if (SunDefinitions.isItemClickType(class282_sub50_sub7_0.clickType, 219826890)) {
			quests = IndexLoaders.ITEM_LOADER.getItemDefinitions((int) class282_sub50_sub7_0.aLong9584).quests;
		} else if (class282_sub50_sub7_0.itemId != -1) {
			quests = IndexLoaders.ITEM_LOADER.getItemDefinitions(class282_sub50_sub7_0.itemId).quests;
		} else if (Class237.isNPCClickType(class282_sub50_sub7_0.clickType)) {
			StringNode class282_sub47_3 = (StringNode) client.NPCS.get((long) ((int) class282_sub50_sub7_0.aLong9584));
			if (class282_sub47_3 != null) {
				NPC npc_4 = (NPC) class282_sub47_3.anObject8068;
				NPCDefinitions npcdefinitions_5 = npc_4.definitions;
				if (npcdefinitions_5.transformTo != null) {
					npcdefinitions_5 = npcdefinitions_5.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
				}
				if (npcdefinitions_5 != null) {
					quests = npcdefinitions_5.quests;
				}
			}
		} else if (EnumDefinitions.isObjectClickType(class282_sub50_sub7_0.clickType)) {
			ObjectDefinitions objectdefinitions_6 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefinitions((int) (class282_sub50_sub7_0.aLong9584 >>> 32 & 0x7fffffffL));
			if (objectdefinitions_6.toObjectIds != null) {
				objectdefinitions_6 = objectdefinitions_6.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER, (byte) 45);
			}
			if (objectdefinitions_6 != null) {
				quests = objectdefinitions_6.anIntArray5707;
			}
		}
		return quests;
	}
}
