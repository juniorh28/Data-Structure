import java.io.*;
import java.util.*;

public class MyQueue{

    public MyQueue(String fileName) throws IOException{
        File week = new File(fileName);
        Scanner scanner = new Scanner(week);
        ArrayList<String> extractedSong = new ArrayList<>();
        Playlist  songList = new Playlist();
        while (scanner.hasNext()){
            String line = scanner.nextLine();//reads each line 	
			
			String[] lineSplit = line.split(",");//split that line by commas
            extractedSong.add(lineSplit[1]);//builds the array list of songs
        }
        Collections.sort(extractedSong);//sort in ascending order
        for(int i=0; i<extractedSong.size(); i++) {
        	songList.addSong(extractedSong.get(i));//add each song to a Playlist(LinkedList)
     
        }
        System.out.println(songList);
        scanner.close();
    }
}