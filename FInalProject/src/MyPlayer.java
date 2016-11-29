import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MyPlayer {
	public static void main(String[] args) {
		if(args.length!=2){
			System.out.println("input formar error!");
		}
		String audioFileName=args[0];
		String videoFileName=args[1];
		InputStream ais=null;
		InputStream vis=null;
		try{
			ais=getAudioSrteam(audioFileName);
			vis=getVideoStream(videoFileName);
		}
		catch(FileNotFoundException e){
			System.err.println("The file does not exist!");
			return;
		}
		GUI gui=new GUI(ais,vis);
		gui.run();
	}

	private static InputStream getVideoStream(String videoFileName) throws FileNotFoundException {
//		return null;
		return new FileInputStream(videoFileName);
	}

	private static InputStream getAudioSrteam(String audioFileName) throws FileNotFoundException {
		return new FileInputStream(audioFileName);
	}
	
	
}
