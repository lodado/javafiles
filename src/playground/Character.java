package playground;

import java.util.ArrayList;

/**ĳ������ ������ ��� Ŭ���� */
class Character {
	/** ĳ������ �̸� */
	String name;
	/** ĳ������ ü�� */
	int hp;
	/** ĳ������ ���ݷ� */
	int off; 
	/** ĳ������ ���� */
	int def; 
	/** ĳ������ ��ø */
	int agi; 
	/** ĳ������ �̹��� */
	String image;
	//ArrayList<Item> inventory;
	//Item[] equip = new Item[2];
	/**
   	 * ĳ������ ������ �����Ѵ�.
   	 * @param name - ĳ���� �̸�
   	 * @param hp - ĳ���� ü��
   	 * @param off - ĳ���� ���ݷ�
   	 * @param def - ĳ���� ����
   	 * @param agi - ĳ���� ��ø
   	 * @param image - ĳ���� �̹���
   	 */
	Character(String name, int hp, int off, int def, int agi, String image) {
		this.name = name;
		this.hp = hp;
		this.off = off;
		this.def = def;
		this.agi = agi;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public synchronized int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		synchronized(this)
		{
			this.hp = hp;
		}
	}

	public int getOff() {
		return off;
	}

	public void setOff(int off) {
		this.off = off;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getAgi() {
		return agi;
	}

	public void setAgi(int agi) {
		this.agi = agi;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	/*
	public void setEquip(Item I)
	{
	   if(I.getItemId()<=5) {
	      equip[0] = I;
	   }
	   else if(9<=I.getItemId()&&I.getItemId()<=11) {
	      equip[1] = I;
	   }
	}
	*/
}