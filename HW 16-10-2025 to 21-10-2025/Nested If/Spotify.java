import java.util.Scanner;
class Spotify
{
	public static void main(String [] args)
	{
		Scanner music = new Scanner(System.in);
		System.out.println("Spotify Welcomes You");
		System.out.println("Select Your Option,The Options Are");
		System.out.println("1.A.R.Rahman");
		System.out.println("2.Anirudh");
		System.out.println("3.Harish Jeyaraj");
		System.out.println("4.IllaiyaRaja");
		System.out.println("5.U1");
		System.out.println("Select Your Singer");
		int singer = music.nextInt();
		
		if(singer == 1)
		{
			System.out.println("Choose Your Options for the playlist");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Motivational Song");
			System.out.println("4.Sad");
			int songTypes = music.nextInt();
			
			if(songTypes == 1)
			{
				System.out.println("~ Netru illatha Matram");
				System.out.println("~ Enna Solla Pogirai");
				System.out.println("~ Ennavale Adi Ennavale");
				System.out.println("~ Malargale Malargale");
			}
			else if(songTypes == 2)
			{
				System.out.println("~ Thaniya Thaniya");
				System.out.println("~ Mukkala Mukkabala");
				System.out.println("~ Urvashi Urvashi");
				System.out.println("~ Aathichudi");
			}
			else if(songTypes == 3)
			{
				System.out.println("~ Vande Mataram");
				System.out.println("~ Oruvan Oruvan Mudhalali");
				System.out.println("~ Shakthi Kodu");
				System.out.println("~ Kapal Yeari Poyachu");
			}
			else if(songTypes == 4)
			{
				System.out.println("~ Poongatrile");
				System.out.println("~ Marudaani");
				System.out.println("~ Minnale En Vazhvin");
				System.out.println("~ Rasathi");
				System.out.println("~ Oru Poiyavathu Sol");
			}
			else
			{
			System.out.println("Select the next Singer");
			}
		}
		else if(singer == 2)
		{
			System.out.println("Choose Your Options for the playlist");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Motivational Song");
			System.out.println("4.Sad");
			int songTypes = music.nextInt();
			if(songTypes == 1)
			{
				System.out.println("~ Neeyum Nanum Anbe");
				System.out.println("~ Velicha Poove");
				System.out.println("~ Po Indru Neeyaga");
				System.out.println("~ Nee Partha Vizhigal");
			}
			else if(songTypes ==2)
			{
				System.out.println("~ Vaathi Raid");
				System.out.println("~ Naa Ready");
				System.out.println("~ Badaas");
				System.out.println("~ Vantha Edam");
			}
			else if(songTypes == 3)
			{
				System.out.println("~ Velai Illa Pattathari");
				System.out.println("~ Bhoomi Enna Suthudhe");
				System.out.println("~ Edhir Neechal");
				System.out.println("~ Surviva");
			}
			else if(songTypes == 4)
			{
				System.out.println("~ Porkanda Singam");
				System.out.println("~ Kanave Kanave");
				System.out.println("~ Kannana Kanne");
				System.out.println("~ Jodi Nilave");
			}
			else
			{
				System.out.println("Choose the next singer");
			}
		}
		else if(singer == 3)
		{
			System.out.println("Choose Your Options for the playlist");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Sad");
			int songTypes = music.nextInt();
			
			if(songTypes == 1)
			{
				System.out.println("~ Unnale");
				System.out.println("~ Annul Maele");
				System.out.println("~ Yedho Ondru");
				System.out.println("~ Vaseegara");
				System.out.println("~ Paartha Mudhal");
			}
			else if(songTypes == 2)
			{
				System.out.println("~ Tirunelveli Halwa Da");
				System.out.println("~ Aradi Katre");
				System.out.println("~ Soda Bottle");
				System.out.println("~ Aruva Meesai");
			}
            else if(songTypes == 3)
			{
				System.out.println("~ Venmathiye");
				System.out.println("~ Oh Maname");
				System.out.println("~ Yamma Yamma");
				System.out.println("~ Othaiyile");
			}
			else
			{
				System.out.println("choose your next singer");
			}
		    
		}
		else if(singer == 4)
		{
			System.out.println("Choose Your Options for the playlist");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Sad");
			int songTypes = music.nextInt();
			
			if(songTypes == 1)
			{
				System.out.println("~ Oru Killi Uruguthe");
				System.out.println("~ Kuzhaloothu Kannanukku");
				System.out.println("~ Ennai Thottu");
				System.out.println("~ Raja Raja Cholan");
			}
			else if(songTypes == 2)
			{
				System.out.println("~ Ooruvittu Ooruvanthu");
				System.out.println("~ Nooru Varusham");
				System.out.println("~ Aasai Nooruvagai");
				System.out.println("~ Aasai Athigam Vachu");
			}
			else if(songTypes == 3)
			{
				System.out.println("~ Kanne Kalaimane");
				System.out.println("~ Thene Thenpandi Neeye");
				System.out.println("~ Paadi Parantha Killi");
				System.out.println("~ Nilave Vaa");
			}
			else 
			{
				System.out.println("choose your next singer");
			}
		}
		else if(singer == 5)
		{
			System.out.println("Choose Your Options for the playlist");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Motivational Song");
			System.out.println("4.Sad");
			int songTypes = music.nextInt();
			
			if(songTypes == 1)
			{
				System.out.println("~ Aathadi Manasudhan");
				System.out.println("~ Chinna Sirisu");
				System.out.println("~ Venmeggam");
				System.out.println("~ Iyyayyo");
			}
			else if(songTypes == 2)
			{
				System.out.println("~ Machi Open the Bottle");
				System.out.println("~ Saroja Saman Nikalo");
				System.out.println("~ No Money No Honey");
				System.out.println("~ Villaiyadu Mankatha");
			}
			else if(songTypes == 3)
			{
				System.out.println("~ Edhirthu Nil");
				System.out.println("~ Oru Nalil");
				System.out.println("~ Nimirnthu Nil");
				System.out.println("~ Ungakkule Mirugam");
			}
			else if(songTypes == 4)
			{
				System.out.println("~ Kadhal Valarthen");
				System.out.println("~ Yedho Ondru Ennai");
				System.out.println("~ Pogathe");
				System.out.println("~ Ninaithu Ninaithu");
			}
			else
			{
				System.out.println("Thank You");
			}
		}
		else
		{
			System.out.println("Thank You");
		}
	}
}