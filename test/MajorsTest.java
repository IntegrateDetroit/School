import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MajorsTest {

    @Test
    public void electricalEngineering(){
        assertThat(Majors.ELECTRICAL_ENGINEERING.getName()).isEqualTo("Electrical Engineering");
        assertThat(Majors.ELECTRICAL_ENGINEERING.getCreditsRequired()).isEqualTo(42);
    }

    @Test
    public void undecided(){
        assertThat(Majors.UNDECIDED.getName()).isEqualTo("Undecided");
        assertThat(Majors.UNDECIDED.getCreditsRequired()).isEqualTo(0);
    }

    @Test
    public void computerScience(){
        assertThat(Majors.COMPUTER_SCIENCE.getName()).isEqualTo("Computer Science");
        assertThat(Majors.COMPUTER_SCIENCE.getCreditsRequired()).isEqualTo(44);
    }

    @Test
    public void history(){
        assertThat(Majors.HISTORY.getName()).isEqualTo("History");
        assertThat(Majors.HISTORY.getCreditsRequired()).isEqualTo(30);
    }

    @Test
    public void all(){
        assertThat(Majors.ALL.getName()).isEqualTo("All");
        assertThat(Majors.ALL.getCreditsRequired()).isEqualTo(0);
    }
}