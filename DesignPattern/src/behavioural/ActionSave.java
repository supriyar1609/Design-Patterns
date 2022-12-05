package behavioural;
public class ActionSave implements ActionListener {
	private Document doc;
	 
    public ActionSave(Document doc) {
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.save();
    }

}