package Aula07.Desafio;

import java.util.Scanner;
import java.util.ArrayList;

public class RadioBolso implements InterfaceRadio {

    private boolean ligadoDesligado;
    private boolean tocarMusica;
    private int volume;
    private double estacaoAtual;
    private String banda;

    //
    private boolean playBoolean;
    private boolean mudarBandaBoolean = true;
    private String mudarAMouFM = "";

    //Construtor
    public RadioBolso() {

    }

    public RadioBolso(boolean ligadoDesligado, boolean tocarMusica, int volume, double estacaoAtual, String banda) {
        this.ligadoDesligado = ligadoDesligado;
        this.tocarMusica = tocarMusica;
        this.volume = volume;
        this.estacaoAtual = estacaoAtual;
        this.banda = banda;
    }

    //Setter and Getters
    public boolean getLigadoDesligado() {
        return this.ligadoDesligado;
    }

    public void setLigadoDesligado(boolean ligadoDesligado) {
        this.ligadoDesligado = ligadoDesligado;
    }

    public boolean getTocarMusica() {
        return this.tocarMusica;
    }

    public void setTocarMusica(boolean tocarMusica) {
        this.tocarMusica = tocarMusica;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getEstacaoAtual() {
        return this.estacaoAtual;
    }

    public void setEstacaoAtual(double estacaoAtual) {
        this.estacaoAtual = estacaoAtual;
    }

    public String getBanda() {
        return this.banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    //Métodos
    @Override
    public void play() {

        if (this.getLigadoDesligado() == false) {
            System.out.println("Rádio desligado/N/Play");
            playBoolean = false;
        } else {
            System.out.println("Rádio tocando");
            playBoolean = true;
        }
    }

    @Override
    public void pause() {

        if (playBoolean == true && this.getLigadoDesligado() == true) {
            System.out.println("Rádio pausado");
        } else {
            System.out.println("Rádio desligado/N/PS");
        }
    }

    @Override
    public void estado() {

        System.out.println("Ligado/Desligado: ");
        System.out.println(this.getLigadoDesligado());
        System.out.println("Volume: ");
        System.out.println(this.getVolume());
        System.out.println("Banda: ");
        System.out.println(this.getBanda());
        System.out.println("Estação: ");
        System.out.println(this.getEstacaoAtual());

    }

    @Override
    public void dialAumenta(double a) {
        double compareAtualStationFM = 0;
        double compareAtualStationAM = 0;
        double compareFM = 0;
        double compareAM = 0;

        ArrayList<Double> arrayFM = new ArrayList<>();

        for (double i = 87; i <= 108; i += 0.1) {

            String numeroFMstring = String.format("%.1f", i);
            // Erro está na vírgula em vez de , tem que ser .
            numeroFMstring = numeroFMstring.replace(",", ".");
            double numeroConvertido = Double.parseDouble(numeroFMstring);

            arrayFM.add(numeroConvertido);

        }

        for (int k = 0; k <= arrayFM.size() - 1; k++) {
            if (arrayFM.get(k) == a) {
                compareFM = arrayFM.get(k);

            }
            if (arrayFM.get(k) == this.estacaoAtual) {
                compareAtualStationFM = arrayFM.get(k);
            }

        }

        ArrayList<Double> arrayAM = new ArrayList<>();

        for (double i = 520; i <= 1710; i += 1) {

            arrayAM.add(i);

        }

        for (int m = 0; m <= arrayAM.size() - 1; m++) {
            if (arrayAM.get(m) == a) {
                compareAM = arrayAM.get(m);

            }
            if (arrayAM.get(m) == this.estacaoAtual) {
                compareAtualStationAM = arrayAM.get(m);
            }

        }

        if (this.getLigadoDesligado() == false) {
            System.out.println("Rádio desligado/N/DA");
        } //FM
        else if (this.getBanda() == "FM" && this.getLigadoDesligado() == true && a == compareFM && this.estacaoAtual == compareAtualStationFM) {

            if (a < this.estacaoAtual) {
                System.out.println("Voce não aumentou a estação FM/DA");

            } else if (a > this.estacaoAtual) {
                System.out.println("Voce aumentou a estação FM/DA");
                this.estacaoAtual = a;

            }

        } else if (this.getBanda() == "FM" && a > 108 && a == compareFM && this.estacaoAtual == compareAtualStationFM) {
            System.out.println("Frequencia máxima é 108/ FM");
        } else if (this.getBanda() == "FM" && a < 87 && a == compareFM && this.estacaoAtual == compareAtualStationFM) {
            System.out.println("Frequencia mínima é 87/ FM");
        } else if (this.getBanda() == "FM" && a != compareFM) {
            System.out.println("Número não válido para FM para mudar valores");
        } else if (this.getBanda() == "AM" && this.estacaoAtual == compareAtualStationFM) {
            System.out.println("Banda AM porém com valores de FM");
        } //AM
        else if (this.getBanda() == "AM" && this.getLigadoDesligado() == true && a == compareAM && this.estacaoAtual == compareAtualStationAM) {

            if (a < this.estacaoAtual) {
                System.out.println("Voce não aumentou a estação AM/DA");

            } else if (a > this.estacaoAtual) {
                System.out.println("Voce aumentou a estação AM/DA");
                this.estacaoAtual = a;

            }

        } else if (this.getBanda() == "AM" && a > 1710 && a == compareAM && this.estacaoAtual == compareAtualStationAM) {
            System.out.println("Frequencia máxima é 1710/ AM");
        } else if (this.getBanda() == "AM" && a < 520 && a == compareAM && this.estacaoAtual == compareAtualStationAM) {
            System.out.println("Frequencia mínima é 520/ AM");
        } else if (this.getBanda() == "AM" && a != compareAM) {
            System.out.println("Número não válido para mudar valores AM");
        } else if (this.getBanda() == "FM" && this.estacaoAtual == compareAtualStationAM) {
            System.out.println("Banda FM porém com valores de AM");
        }
    }

    @Override
    public void dialDiminui(double a) {

        double compareAtualStationFM = 0;
        double compareAtualStationAM = 0;

        double compareFM = 0;

        double compareAM = 0;

        ArrayList<Double> arrayFM = new ArrayList<>();

        for (double i = 87; i <= 108; i += 0.1) {

            String numeroFMstring = String.format("%.1f", i);
            // Erro está na vírgula em vez de , tem que ser .
            numeroFMstring = numeroFMstring.replace(",", ".");
            double numeroConvertido = Double.parseDouble(numeroFMstring);

            arrayFM.add(numeroConvertido);

        }

        for (int k = 0; k <= arrayFM.size() - 1; k++) {
            if (arrayFM.get(k) == a) {
                compareFM = arrayFM.get(k);

            }
            if (arrayFM.get(k) == this.estacaoAtual) {
                compareAtualStationFM = arrayFM.get(k);
            }

        }

        ArrayList<Double> arrayAM = new ArrayList<>();

        for (double i = 520; i <= 1710; i += 1) {

            arrayAM.add(i);

        }

        for (int m = 0; m <= arrayAM.size() - 1; m++) {
            if (arrayAM.get(m) == a) {
                compareAM = arrayAM.get(m);

            }
            if (arrayAM.get(m) == this.estacaoAtual) {
                compareAtualStationAM = arrayAM.get(m);
            }

        }

        if (this.getLigadoDesligado() == false) {

            System.out.println("Rádio desligado/N/DD");
        } else if (this.getBanda() == "FM" && this.getLigadoDesligado() == true && a == compareFM && this.estacaoAtual == compareAtualStationFM) {

            if (a > this.estacaoAtual) {
                System.out.println("Voce não diminuiu a estação FM/DI");

            } else if (a < this.estacaoAtual) {
                System.out.println("Voce diminuiu a estação FM/DI");
                this.estacaoAtual = a;

            }

        } else if (this.getBanda() == "FM" && a > 108 && a == compareFM && this.estacaoAtual == compareAtualStationFM) {
            System.out.println("Frequencia máxima é 108/ FM");
        } else if (this.getBanda() == "FM" && a < 87 && a == compareFM && this.estacaoAtual == compareAtualStationFM) {
            System.out.println("Frequencia mínima é 87/ FM");
        } else if (this.getBanda() == "FM" && a != compareFM) {
            System.out.println("Número inválido para trocar valores de FM");
        } else if (this.getBanda() == "AM" && this.estacaoAtual == compareAtualStationFM) {
            System.out.println("Banda AM porém com valores de FM");
        } //AM
        else if (this.getBanda() == "AM" && this.getLigadoDesligado() == true && a == compareAM && this.estacaoAtual == compareAtualStationAM) {

            if (a > this.estacaoAtual) {
                System.out.println("Voce não diminuiu a estação AM/DI");

            } else if (a < this.estacaoAtual) {
                System.out.println("Voce diminuiu a estação AM/DI");
                this.estacaoAtual = a;

            }

        } else if (this.getBanda() == "AM" && a > 1710 && a == compareAM && this.estacaoAtual == compareAtualStationAM) {
            System.out.println("Frequencia máxima é 1710/ AM");
        } else if (this.getBanda() == "AM" && a < 520 && a == compareAM && this.estacaoAtual == compareAtualStationAM) {
            System.out.println("Frequencia mínima é 520/ AM");
        } else if (this.getBanda() == "AM" && a != compareAM) {
            System.out.println("Número inválido para trocar valores AM");
        } else if (this.getBanda() == "FM" && this.estacaoAtual == compareAtualStationAM) {
            System.out.println("Banda FM porém com valores de AM");
        }

    }

    @Override
    public void volumeAumenta() {

        if (this.getLigadoDesligado() == false) {

            System.out.println("Rádio desligado/N/VA");
        } else if (this.getVolume() > 50 || (this.getVolume() + 5) > 50) {
            System.out.println("Volume máximo");
        } else {
            this.volume = this.volume + 5;
            System.out.println("Volume aumentado");
        }

    }

    @Override
    public void volumeDiminui() {

        if (this.getLigadoDesligado() == false) {

            System.out.println("Rádio desligado/N/VD");
        } else if (this.getVolume() < 0 || (this.getVolume() - 5) < 0) {
            System.out.println("Volume mínimo");
        } else {
            this.volume = this.volume - 5;
            System.out.println("Volume diminuído");
        }

    }

    @Override
    public void trocarFaixaSintonia() {

        double compareFM = 0;

        double compareAM = 0;

        ArrayList<Double> arrayFMcompare = new ArrayList<>();

        for (double i = 87; i <= 108; i += 0.1) {

            String numeroFMstring = String.format("%.1f", i);
            // Erro está na vírgula em vez de , tem que ser .
            numeroFMstring = numeroFMstring.replace(",", ".");
            double numeroConvertido = Double.parseDouble(numeroFMstring);

            arrayFMcompare.add(numeroConvertido);

        }

        for (int k = 0; k <= arrayFMcompare.size() - 1; k++) {
            if (arrayFMcompare.get(k) == this.estacaoAtual) {
                compareFM = arrayFMcompare.get(k);

            }

        }

        ArrayList<Double> arrayAMcompare = new ArrayList<>();

        for (double i = 520; i <= 1710; i += 1) {

            arrayAMcompare.add(i);

        }

        for (int m = 0; m <= arrayAMcompare.size() - 1; m++) {
            if (arrayAMcompare.get(m) == this.estacaoAtual) {
                compareAM = arrayAMcompare.get(m);

            }

        }

        if (this.banda == "FM" && this.estacaoAtual == compareFM) {
            mudarAMouFM = "FM";
        } else if (this.banda == "AM" && this.estacaoAtual == compareAM) {
            mudarAMouFM = "AM";
        } else {
            System.out.println("Conferir se os dados colocados estão certos e condizentes ");
        }

        // FM para AM  
        if (mudarAMouFM == "FM") {

            this.banda = "AM";

            if (this.estacaoAtual >= 87 && this.estacaoAtual <= 108) {

                double estacaoFM = this.estacaoAtual;

                //index
                double a = 0;
                double Am = 1710 - 520;
                double Fm = 211 - 1;

                double razao = Am / Fm;

                ArrayList<Double> arrayFM = new ArrayList<>();

                for (double i = 87; i <= 108; i += 0.1) {

                    String numeroFMstring = String.format("%.1f", i);
                    // Erro está na vírgula em vez de , tem que ser .
                    numeroFMstring = numeroFMstring.replace(",", ".");
                    double numeroConvertido = Double.parseDouble(numeroFMstring);

                    arrayFM.add(numeroConvertido);

                }

                for (int k = 0; k <= arrayFM.size(); k++) {
                    if (arrayFM.get(k).equals(estacaoFM)) {

                        a = k;
                        break;

                    }
                }

                double estacaoAM = 520 + (a) * razao;

                String estacaoAMstring = String.format("%.0f", estacaoAM);
                estacaoAMstring = estacaoAMstring.replace(",", ".");
                double estacaoAMnumber = Double.parseDouble(estacaoAMstring);

                this.estacaoAtual = estacaoAMnumber;

                System.out.println("Depois de FM:" + "" + estacaoFM + "" + "para AM:" + "" + this.estacaoAtual);

            }
        } // AM para FM
        else if (mudarAMouFM == "AM") {

            this.banda = "FM";

            if (this.estacaoAtual >= 520 && this.estacaoAtual <= 1710) {

                double estacaoAM = this.estacaoAtual;

                double a = 0;
                double FM = 211 - 1;
                double AM = 1710 - 520;
                double razao = FM / AM;

                ArrayList<Double> arrayAM = new ArrayList<>();

                for (double i = 520; i <= 1710; i += 1) {

                    arrayAM.add(i);

                }

                for (int k = 0; k <= arrayAM.size() - 1; k++) {
                    if (arrayAM.get(k) == estacaoAM) {

                        a = k;

                        break;

                    }
                }

                double indexFM = (a) * razao;
                String indexFMstring = String.format("%.0f", indexFM);
                int indexFMnumber = Integer.parseInt(indexFMstring);

                ArrayList<Double> arrayFM = new ArrayList<>();

                for (double i = 87; i <= 108; i += 0.1) {

                    String numeroFormatado = String.format("%.1f", i);
                    numeroFormatado = numeroFormatado.replace(",", ".");
                    double numeroConvertido = Double.parseDouble(numeroFormatado);

                    arrayFM.add(numeroConvertido);

                }

                double estacaoFM = arrayFM.get(indexFMnumber);

                this.estacaoAtual = estacaoFM;

                System.out.println("Depois de AM:" + "" + estacaoAM + "" + "para FM:" + "" + this.estacaoAtual);

            }
        }
    }

}
