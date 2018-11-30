package reflectionWeek4Pro;

import java.util.Objects;

public class Command {
    private String command;
    private Integer frequency;

    public Command(String command, Integer frequency) {
        this.command = command;
        this.frequency = frequency;
    }

    public String getCommand() {
        return command;
    }

    public Integer getFrequency() {
        return frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Command)) return false;
        Command command1 = (Command) o;
        return Objects.equals(getCommand(), command1.getCommand()) &&
                Objects.equals(getFrequency(), command1.getFrequency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommand(), getFrequency());
    }

    @Override
    public String toString() {
        return "Command{" +
                "command='" + command + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
