package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/30
 * Time: 16:29
 * LinkedList don (Singly LinkedList)
 */
public class MusicPlaylist {
    SongNode head; // Bai hat dau tien
    SongNode current; // Bai hat dang phat

    public void addSong(String songName) {
        SongNode newSong = new SongNode(songName);
        if (head == null) {
            head = newSong;
            current = head;
        } else {
            SongNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newSong;
        }
    }

    public String playNextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.songName;
        }
        return "Het danh sach phat";
    }
}
