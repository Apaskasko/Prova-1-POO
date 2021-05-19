public class Principal {
    public static void main(String[] args) throws Exception {

        // Alunos //

        System.out.println("\n**************************************\n");

        Alunos aluno = new Alunos("Davi", 100, 12);
        Professores primeiro = new Professores("Gustavo", 1100.00, 25);

        System.out.println("O(a) aluno(a) " + aluno.getNomeAluno() + " de matrícula " + aluno.getMatriculaAluno()
                + " tem " + aluno.getidadeAluno() + " anos.");
        aluno.setNomeAluno("Enzo");
        aluno.setMatriculaAluno(101);
        aluno.setIdadeAluno(13);
        System.out.println("O(a) aluno(a) " + aluno.getNomeAluno() + " de matrícula " + aluno.getMatriculaAluno()
                + " tem " + aluno.getidadeAluno() + " anos.");
        aluno.Dias();
        aluno.Metas();

        // Professores //
        System.out.println("\n**************************************\n");

        System.out.println("O(a) Professor " + primeiro.getNome() + " com o salário de " + primeiro.getSalario()
                + " tem " + primeiro.getIdade() + " anos.");
        primeiro.setNome("Livia");
        primeiro.setSalario(1100.00);
        primeiro.setIdade(29);
        System.out.println("O(a) Professor " + primeiro.getNome() + " com o salário de " + primeiro.getSalario()
                + " tem " + primeiro.getIdade() + " anos.");
        primeiro.quintoDia();
        primeiro.Metas();

        // Escola //
        System.out.println("\n**************************************\n");

        Escola escola = new Escola("Karate Kid", 16000.00, 2000.00, 80);
        System.out.println("O valor arreacadado pela escola " + escola.getNome() + " foi de R$ "
                + escola.getRendaMensal() + " com uma quantidade de " + escola.getQntAlunos() + " alunos.");
        escola.Metas();
        ;
        escola.ReceitaMensal();
        escola.setDespesas(3000.00);
        escola.setRendaMensal(18000.00);
        escola.setNome("Karate Kid");
        escola.setQntAlunos(90);
        System.out.println("O valor arreacadado pela escola " + escola.getNome() + " foi de R$"
                + escola.getRendaMensal() + " com uma quantidade de " + escola.getQntAlunos() + " alunos.");
        escola.Metas();
        ;
        escola.ReceitaMensal();
    }

}