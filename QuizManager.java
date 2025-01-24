class QuizManager {
    private List<Substance> substances;
    private Scanner scanner;

    public QuizManager() {
        substances = new ArrayList<>();
        scanner = new Scanner(System.in);
        loadSubstances();
    }

    //loading "Säuren und Laugen"
    private void loadSubstances() {
        substances.add(new Substance("Salzsäure", "HCl", "HCl → H⁺ + Cl⁻"));
        substances.add(new Substance("Schwefelsäure", "H₂SO₄", "H₂SO₄ → 2H⁺ + SO₄²⁻"));
        substances.add(new Substance("Essigsäure", "CH₃COOH", "CH₃COOH ⇌ H⁺ + CH₃COO⁻"));
        substances.add(new Substance("Natronlauge", "NaOH", "NaOH → Na⁺ + OH⁻"));
        substances.add(new Substance("Kalilauge", "KOH", "KOH → K⁺ + OH⁻"));
        substances.add(new Substance("Ammoniaklösung", "NH₃ (aq)", "NH₃ + H₂O ⇌ NH₄⁺ + OH⁻"));
    }

    //start quiz
    public void startQuiz() {
        System.out.println("Willkommen zum Säuren- und Laugen-Quiz!");
        System.out.println("Beantworte die Fragen so gut du kannst. Schreibe 'exit', um das Quiz zu beenden.\n");

        while (true) {
            //select random substance
            Substance randomSubstance = substances.get(new Random().nextInt(substances.size()));

            //ask question
            System.out.println("Nenne die chemische Formel von: " + randomSubstance.getName());
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase("exit")) {
                System.out.println("Quiz beendet. Viel Erfolg beim Lernen!");
                break;
            }

            //check answer
            if (userAnswer.equalsIgnoreCase(randomSubstance.getFormula())) {
                System.out.println("Richtig! Die Dissoziationsgleichung lautet: " + randomSubstance.getDissociationEquation() + "\n");
            } else {
                System.out.println("Falsch. Die richtige Formel ist: " + randomSubstance.getFormula());
                System.out.println("Dissoziationsgleichung: " + randomSubstance.getDissociationEquation() + "\n");
            }
        }
    }
}
