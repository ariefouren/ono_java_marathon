/*
 * PlayingListTester.java - testing classes SoundTrack and PlayingList
 */
public class PlayingListTester {

	public static void main(String[] args) {
		
		SoundTrack st1 = new SoundTrack("Furioso for Orchestra", "Nabatov, Simon", "Liebermann, Rolf", 8.34);
		SoundTrack st2 = new SoundTrack("Geigy Festival Concerto", "Grieder, Alfons", "Liebermann, Rolf", 12.1);
		SoundTrack st3 = new SoundTrack("Jazz Suite No. 2", "Yablonsky, Dmitry", "Shostakovich, Dmitry", 20.25);
		SoundTrack st4 = new SoundTrack("March", "Yablonsky, Dmitry", "Shostakovich, Dmitry", 3.08);
		SoundTrack st5 = new SoundTrack("Dance 1", "Yablonsky, Dmitry", "Shostakovich, Dmitry", 3.04);
		SoundTrack st6 = new SoundTrack("Finale", "Yablonsky, Dmitry", "Shostakovich, Dmitry", 1.55);
		SoundTrack st7 = new SoundTrack("Rhapsody in Blue", "Robertson, David", "GERSHWIN, G", 17.36);
		SoundTrack st8 = new SoundTrack("Piano Concerto in F Major", "Robertson, David", "GERSHWIN, G", 33.33);
		
		System.out.printf("%s\n", st1.toString());
		System.out.printf("%s\n", st2.toString());
		System.out.printf("%s\n", st3.toString());
		System.out.printf("%s\n", st4.toString());
		System.out.printf("%s\n", st5.toString());
		System.out.printf("%s\n", st6.toString());
		System.out.printf("%s\n", st7.toString());
		System.out.printf("%s\n", st8.toString());
/*		
		PlayingList jazz = new PlayingList("Jazz");
		
		jazz.addSoundTrack(st1);
		jazz.addSoundTrack(st2);
		jazz.addSoundTrack(st3);
		
		System.out.printf("3 sound tracks are added to the playing list\n");
		System.out.print(jazz.toString() +"\n\n");
		
		jazz.addSoundTrack(st4);
		jazz.addSoundTrack(st5);
		jazz.addSoundTrack(st6);
		jazz.addSoundTrack(st7);
		jazz.addSoundTrack(st8);
		
		System.out.printf("5 more sound tracks are added to the playing list\n");
		System.out.print(jazz.toString() +"\n\n");
		*/	

	}
}
