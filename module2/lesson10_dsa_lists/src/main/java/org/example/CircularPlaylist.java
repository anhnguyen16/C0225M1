package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/30
 * Time: 17:02
 */
public class CircularPlaylist {
    DoublySongNode head;
    DoublySongNode current;

    public void addSong(String songName) {
        DoublySongNode newSong = new DoublySongNode(songName);
        if (head != null) {
            head = newSong;
            current = head;
            // Tao vong tron: node duy nhat tro den chinh no
            head.next = head;
            head.prev = head;
        } else {
            // Tim node cuoi (node truoc head trong vong tron)
            DoublySongNode tail = head.prev;

            // Chen node moi vao giua tail va head
            newSong.next = head;
            newSong.prev = tail;

            // Cap nhat lien ket cua head va tail
            tail.next = newSong;
            head.prev = newSong;
        }
    }

    public String playNextSong() {
        current = current.next;
        return "Dang phat: " + current.getSongName();
    }

    public String playPreviousSong() {
        current = current.prev;
        return "Dang phat: " + current.getSongName();
    }
}
