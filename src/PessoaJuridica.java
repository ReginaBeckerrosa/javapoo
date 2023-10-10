
    public class PessoaJuridica extends Pessoa{
    public String cnpj;

    public float CalcularImposto (float rendimento){

//    pessoa Juridica
//    ate 3000-3%
//    de 3000ate 6000-5%
//    de 6000ate 10000-7%
//    acima de 10000-9%



            if (rendimento <= 3000){
                return  rendimento * .03f;

            }
            else if (rendimento <=3500){
                return  rendimento *.05f;
            }
            else if (rendimento<=6000){
                return rendimento * 0.07f;
            }
            else {
                return  rendimento * 0.09f;
            }
        }
    }


