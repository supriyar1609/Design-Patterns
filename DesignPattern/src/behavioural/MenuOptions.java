package behavioural;
public class MenuOptions {

	private ActionListener openCommand;
    private ActionListener saveCommand;
 
    public MenuOptions(ActionListener open, ActionListener save) {
        this.openCommand = open;
        this.saveCommand = save;
    }
    public void clickOpen(){
       openCommand.execute();
    }
    public void clickSave(){
      saveCommand.execute();
    }

}