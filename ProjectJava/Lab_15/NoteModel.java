package Lab_15;
import java.util.ArrayList;
import java.util.List;

public class NoteModel {
    private List<String> notes;

    public NoteModel() {
        this.notes = new ArrayList<>();
    }

    public List<String> getNotes() {
        return notes;
    }

    public void addNote(String note) {
        notes.add(note);
    }

    public void removeNote(String note) {
        notes.remove(note);
    }
    public void removeNoteByIndex(int index) {
        notes.remove(index);
    }

    public void editNote(int index, String newNote) {
        notes.set(index, newNote);
    }
}
