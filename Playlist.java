

public class Playlist {//this is my LinkedList class
    private Song first; // Head pointer
    private Song last; // Tail pointer
    private Song currentSong = first;//first's next points to next song, current song points to first (will move if listenToSong)
    Boolean firstListen = false;
    public Playlist (){}
    
    public boolean isEmpty() {
    	return (first==null);
    }
    public void addSong(String s){ // Also enqueue method
        Song newSong = new Song(s);
        // 
        if(this.first == null){ // checks playlist is empty (head -> null)  if true adds song to list 
                this.first = newSong;
                this.last = newSong;
        }
        else{// else appends newSong to end of list
            this.last.next = newSong;
            this.last = this.last.next;
        

        }
    }
    
    public Song listenToSong(){ // implementing dequeue with currentSong pointer
        // checks if song as been played if true moves the pointer to the next song
        // returns currentSong to be played
        if(firstListen){
            currentSong = currentSong.next;
        }
        else {
            firstListen = true;
        }
        return currentSong;
        
    }
}