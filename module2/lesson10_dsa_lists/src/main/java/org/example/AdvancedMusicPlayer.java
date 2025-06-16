package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/30
 * Time: 16:35
 */
public class AdvancedMusicPlayer {
    private DoublySongNode head; // Bai hat dau tien
    private DoublySongNode tail; // Bai hat cuoi cung
    private DoublySongNode current; // Bai hat dang phat

    public void addSong(String songName) {
        DoublySongNode newSong = new DoublySongNode(songName);
        if (head == null) {
            head = newSong;
            tail = newSong;
            current = head;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
        }
    }

    public String playNextSong() {
        if (current != null & current.prev != null) {
            current = current.prev;
            return current.getSongName();
        }
        return "Da den cuoi danh sach phat";
    }

    public String playPreviousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return current.getSongName();
        }
        return "Da o dau danh sach phat";
    }
}
