public class Question {
    private QuestionType questionType;
    private String text;
    private String answer;

    public Question(QuestionType questionType, Archiv archiv) {
        this.questionType = questionType;
        if (questionType == QuestionType.KINGBYYEAR) {
            int number = (int)(Math.floor(Math.random() *(1080 - 802 + 1) + 802));
            setText("Wer war König von England im Jahr " + number);
            setAnswer(archiv.searchForKingByYear(number).getName());
        }
        if (questionType == QuestionType.PREDECESSOR) {
            boolean kingWithPredecessorFound = false;
            while (!kingWithPredecessorFound) {
                int number = (int) (Math.floor(Math.random() * (archiv.getKings().size())));
                if (archiv.getKings().get(number - 1) != null) {
                    kingWithPredecessorFound = true;
                    if (archiv.getKings().get(number).getNickname() == null) {
                        setText("Wer war der Vorgänger von " + archiv.getKings().get(number).getName() + "?");
                    }else {
                        setText("Wer war der Vorgänger von " + archiv.getKings().get(number).getNickname() + "?");
                    }
                    setAnswer(archiv.getKings().get(number - 1).getName());
                }
            }
        }
        if (questionType == QuestionType.SUCCESOR) {
            boolean kingWithSuccesorFound = false;
            while (!kingWithSuccesorFound) {
                int number = (int) (Math.floor(Math.random() * (archiv.getKings().size())));
                if (archiv.getKings().get(number + 1) != null) {
                    kingWithSuccesorFound = true;
                    if (archiv.getKings().get(number).getNickname() == null) {
                        setText("Wer war der Nachfolger von " + archiv.getKings().get(number).getName() + "?");
                    }else {
                        setText("Wer war der Nachfolger von " + archiv.getKings().get(number).getNickname() + "?");
                    }
                    setAnswer(archiv.getKings().get(number + 1).getName());
                }
            }
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
