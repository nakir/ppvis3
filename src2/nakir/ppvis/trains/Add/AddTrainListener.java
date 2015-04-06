package nakir.ppvis.trains.add;

import nakir.ppvis.trains.model.TrainTableModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTrainListener implements ActionListener {
    private TrainTableModel model;

    public AddTrainListener(TrainTableModel model) {
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog newEntryDialog = new AddTrainDialog(null, model);
        newEntryDialog.setVisible(true);
    }
}
