package functionalProgramming;

import java.util.Optional;

public class Computer {
    private SoundCard soundCard;

    public Computer(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    /*public Optional<SoundCard> getSoundCard() {
        return Optional.ofNullable(soundCard);
    }*/

    public SoundCard getSoundCard() {
        return soundCard;
    }
}
