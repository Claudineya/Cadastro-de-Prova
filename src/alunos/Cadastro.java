package alunos;

import java.util.Date;

    public class Cadastro {
        private int nota;
        private  String descrição;
        private Date data;

        public Cadastro(int nota, String descrição, Date data) {
            this.nota= nota;
            this.descrição = descrição;
            this.data = data;

        }

        public void setDescrição(String descrição) {
            this.descrição = descrição;

        }

        public int getNota() {
            return nota;
        }

        public String getDescrição() {
            return descrição;
        }

        public Date getData() {
            return data;
        }
    }
