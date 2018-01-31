package command.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/28 15:53
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor door = new GarageDoor();

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.door = garageDoor;
    }

    @Override
    public void execute() {
        door.up();
        door.down();
        door.lightOn();
        door.lightOff();
        door.stop();
    }
}
