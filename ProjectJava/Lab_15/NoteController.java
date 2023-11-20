package Lab_15;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoteController {
    private NoteModel model;
    private NoteView view;

    public NoteController(NoteModel model, NoteView view) {
        this.model = model;
        this.view = view;

        view.setAddButtonListener(new AddButtonListener());
        view.setRemoveButtonListener(new RemoveButtonListener());
    }

    public void updateView() {
        view.setNoteListData(model.getNotes().toArray(new String[0]));
    }

    class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String newNote = view.getNoteText();
            model.addNote(newNote);
            updateView();
        }
    }

    class RemoveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedNote = view.getSelectedNote();
            if (selectedNote != null) {
                int index = model.getNotes().indexOf(selectedNote);
                if (index >= 0) {
                    model.removeNoteByIndex(index);
                    updateView();
                }
            }
        }
    }

    public static void main(String[] args) {
        NoteModel model = new NoteModel();
        NoteView view = new NoteView();
        NoteController controller = new NoteController(model, view);
        controller.updateView();
    }
}