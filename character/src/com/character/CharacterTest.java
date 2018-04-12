package com.character;

import java.util.Scanner;

public class CharacterTest extends Character {

	public static void main(String[] args) {

		Gunner gunner = new Gunner();
		Magician magician = new Magician();

		gunner.sethealth(20);
		magician.sethealth(20);

		while (true) {
			System.out.println("���ϴ� ���ڸ� �Է��ϼ���.(1~8) : " +"\n"
		
					+"(1~3)gunner attack" +"\n"
					+"(4~6)magician attack" + "\n"
					+"(7~8)healing" +"\n");
			System.out.println("(1)gunner �� Pistol ����(������:1)" + "\n" 
			                           + "(2)gunner �� Shotgun ����(������:2)" + "\n"
					                   + "(3)gunner �� Bazooka����(������:3)" + "\n" 
			                           + "(4)magician �� Lightning ����(������:1)" + "\n"
					                   + "(5)magician �� Fireball ����(������:2)" + "\n" 
			                           + "(6)magician�� Icestorm����(������:3)" + "\n"
					                   + "(7)gunner�� ü��ȸ��(ȸ��:2)" + "\n"
			                           + "(8)magician�� ü��ȸ��(ȸ��:2)" + "\n"
					                   +"-------------------------------------------------------------------");
			Scanner ra = new Scanner(System.in);
			int gam = ra.nextInt();
			System.out.println("����� �Է��� ���ڴ� : " + gam + " �Դϴ�.");

			if (gam == 1) {
				gunner.pistol(magician);

				System.out.println("gunner�� pistol ����������, magician�� ü���� 1 �����Ͽ����ϴ�.");
				System.out.println("���� gunner �� ü�� :" +gunner.ggethealth()+ "   magician �� ü�� : " + magician.gethealth() + "\n");
			} else if (gam == 2) {
				gunner.shotgun(magician);

				System.out.println("gunner�� ������ ���� ������ ����, magician�� ü���� 2 �����Ͽ����ϴ�.");
				System.out.println("���� gunner �� ü�� :" +gunner.ggethealth()+ "  ���� magician�� ü�� :" + magician.gethealth() + "\n");
			} else if (gam == 3) {
				gunner.bazooka(magician);

				System.out.println("gunner �� ġ������ bazooka ������ ����, magician �� ü���� 3 �����Ͽ����ϴ�.");
				System.out.println("���� magician�� ü�� :" + magician.gethealth() + "\n");

			} else if (gam == 4) {
				magician.lightning(gunner);

				System.out.println("magician�� ���� lightning�� ����, gunner �� ü���� 1 �����Ͽ����ϴ�.");
				System.out.println("���� gunner�� ü�� : " + gunner.ggethealth() + "\n");

			} else if (gam == 5) {
				magician.fireball(gunner);

				System.out.println("magician �� ������ Fireball ������ ����, gunner �� ü���� 2 �����Ͽ����ϴ�.");
				System.out.println("���� gunner�� ü�� :" + gunner.ggethealth() + "\n");

			} else if (gam == 6) {
				magician.icestorm(gunner);

				System.out.println("magician �� ġ������ Icestorm ������ ����, gunner �� ü���� 3 �����Ͽ����ϴ�.");
				System.out.println("���� gunner�� ü�� :" + gunner.ggethealth() + "\n");

			}else if(gam ==7) {
				gunner.gheal(gunner);
				
				System.out.println("gunner �� ���������� �����Ͽ����ϴ�. ü���� 2 ���");
				System.out.println("���� gunner�� ü�� :" + gunner.ggethealth() + "\n");
				
			}else if(gam==8) {
				magician.mheal(magician);
				
				System.out.println("magician �� ���������� �����Ͽ����ϴ�. ü���� 2 ���");
				System.out.println("���� magician�� ü�� :" + magician.gethealth() + "\n");
				
			}
			
			

			if (gunner.ggethealth() == 0) {
				System.out.println("gunner�� ü���� 0�� �Ǿ����ϴ�. Magician �� �¸�!!!!!!!");
				System.exit(0);
			} else if (magician.gethealth() == 0) {
				System.out.println("magician�� ü���� 0�� �Ǿ����ϴ�. Gunner �� �¸�!!!!!!!");
				System.exit(0);

			}

		}

		// + �÷��̾ ���� 3���� �Է��ϴ� �� ����.
		// + ��ų ����� 1~3���� �Է��ϰ�, 1~3�� ������ų ���.
		// + ����� = ���������� 1~3 ��ų �������� ���ư�.
		// + �÷��̾� ���� ����1~3������ ��ų �������� ����. ex) 1���� = 2������, 2���� = 1������

		/*
		 * while(true) { System.out.println("���ϴ� ���ڸ� �Է��ϼ���.(1~3) : "); Scanner ra = new
		 * Scanner(System.in); int gam = ra.nextInt(); //gunner -> ��ų3
		 * System.out.println("����� �Է��� ���ڴ� : " + gam + " �Դϴ�."); Random rr = new
		 * Random(); int ram = rr.nextInt(3)+1; //magician -> ��ų3
		 * 
		 * if(gam<ram){ System.out.println("����� : "+gam+" ��ǻ�� : "+ram);
		 * magician.icestorm(gunner); //System.out.println(magician + "  �� ġ������ " + rr.
		 * + " ������ ����, " + gunner + " �� ü���� " + ������ + " �����Ͽ����ϴ�.");
		 * System.out.println("���� gunner�� ü�� :" + gunner.ggethealth()+"\n"); }
		 * 
		 * else if(gam>ram){ System.out.println("����� : "+gam+" ��ǻ�� : "+ram); //
		 * System.out.println("����� ��"); // ������ �Է� }
		 * 
		 * else if(gam>3){ System.out.println("�Է� �ؾ� �� ���ڸ� �ʰ��Ͽ����ϴ�."); }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

	}
}
