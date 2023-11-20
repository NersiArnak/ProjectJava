package Lab_15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoteView extends JFrame {
    private DefaultListModel<String> listModel;
    private JList<String> noteList;
    private JTextField noteTextField;
    private JButton addButton;
    private JButton removeButton;

    public NoteView() {
        listModel = new DefaultListModel<>();
        noteList = new JList<>(listModel);
        noteTextField = new JTextField(20); // Поле ввода с размером 20 символов
        addButton = new JButton("Добавить");
        removeButton = new JButton("Удалить");

        JPanel panel = new JPanel();
        panel.add(noteTextField);
        panel.add(addButton);
        panel.add(removeButton);

        setLayout(new BorderLayout());
        add(new JScrollPane(noteList), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getNoteText() {
        return noteTextField.getText();
    }

    public void setNoteListData(String[] data) {
        listModel.removeAllElements();
        for (String note : data) {
            listModel.addElement(note);
        }
    }

    public void setAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void setRemoveButtonListener(ActionListener listener) {
        removeButton.addActionListener(listener);
    }

    public String getSelectedNote() {
        return noteList.getSelectedValue();
    }
}
