public class Question {
    private QuestionType questionType;
    private String text;
    private String answer;

    public Question(QuestionType questionType, Archiv archiv) {
        this.questionType = questionType;
        if (questionType == QuestionType.KINGBYYEAR) {
            int number = (int)(Math.floor(Math.random() *(1013 - 802 + 1) + 802));
            setText("Wer war König von England im Jahr " + number);
            setAnswer(archiv.searchForKingByYear(number).getName());
        }
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
