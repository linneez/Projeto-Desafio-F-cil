package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

        public class Menu {

            // Instancia Teclado
            Scanner scanner = new Scanner(System.in);

            public void executarMenu() {
                boolean exit = false;

                while (!exit) {
                    System.out.println("/*******************/");
                    System.out.println("/*    Geometria    */");
                    System.out.println("/*******************/");
                    System.out.println("/* 1 - Circulo     */");
                    System.out.println("/* 2 - Retângulo   */");
                    System.out.println("/* 3 - Triângulo   */");
                    System.out.println("/* 4 - Sair        */");
                    System.out.println("/*******************/");

                    System.out.print("Informe a opção desejada: ");
                    int optionUser = scanner.nextInt();

                    switch (optionUser) {
                        case 1:
                            executarMenuCirculo();
                            break;
                        case 2:
                            executarMenuRetangulo();
                            break;
                        case 3:
                            executarMenuTriangulo();
                            break;
                        case 4:
                            System.out.println("Saindo...");
                            exit = true;
                            break;
                        default:
                            System.out.println("Escolha uma Opção Válida!");
                    }
                }
            }

            private void executarMenuCirculo() {
                boolean exitCirculo = false;
                Circulo circulo = new Circulo();
                boolean validaCadastro = false;

                while (!exitCirculo) {
                    System.out.println("/**************************/");
                    System.out.println("/****     Circulo      ****/");
                    System.out.println("/**************************/");
                    System.out.println("/* 1 - Cadastrar Circulo  */");
                    System.out.println("/* 2 - Calcular Area      */");
                    System.out.println("/* 3 - Calcular Perimetro */");
                    System.out.println("/* 4 - Sair               */");
                    System.out.println("/**************************/");
                    System.out.print("Informe a opção desejada: ");

                    int optionCirculo = scanner.nextInt();

                    switch (optionCirculo) {
                        case 1:
                            validaCadastro = circulo.cadastrarCirculo();
                            break;
                        case 2:
                            if (validaCadastro) circulo.calcularArea();
                            else System.out.println("Cadastre um Circulo");
                            break;
                        case 3:
                            if (validaCadastro) circulo.calcularPerimetro();
                            else System.out.println("Cadastre um Circulo");
                            break;
                        case 4:
                            System.out.println("Saindo do Circulo ...");
                            exitCirculo = true;
                            break;
                        default:
                            System.out.println("Escolha uma Opção Válida!");
                    }
                }
            }

            private void executarMenuRetangulo() {
                boolean exitRetangulo = false;
                Retangulo retangulo = new Retangulo();
                boolean validaRetangulo = false;

                while (!exitRetangulo) {
                    System.out.println("/**************************/");
                    System.out.println("/****     Retangulo    ****/");
                    System.out.println("/**************************/");
                    System.out.println("/* 1 - Cadastrar Retangulo  */");
                    System.out.println("/* 2 - Calcular Area      */");
                    System.out.println("/* 3 - Calcular Perimetro */");
                    System.out.println("/* 4 - Sair               */");
                    System.out.println("/**************************/");
                    System.out.print("Informe a opção desejada: ");

                    int optionRetangulo = scanner.nextInt();

                    switch (optionRetangulo) {
                        case 1:
                            validaRetangulo = retangulo.cadastrarRetangulo();
                            break;
                        case 2:
                            if (validaRetangulo) retangulo.calcularArea();
                            else System.out.println("Cadastre um Retangulo!");
                            break;
                        case 3:
                            if (validaRetangulo) retangulo.calcularPerimetro();
                            else System.out.println("Cadastre um Retangulo!");
                            break;
                        case 4:
                            System.out.println("Saindo Retângulo...");
                            exitRetangulo = true;
                            break;
                        default:
                            System.out.println("Escolha uma opção válida...");
                    }
                }
            }
        // copiei o retângulo, apenas modifiquei o nome e add as opções diferentes
            private void executarMenuTriangulo() {
                boolean exitTriangulo = false;
                Triangulo triangulo = new Triangulo();
                boolean validaTriangulo = false;

                while (!exitTriangulo) {
                    System.out.println("/**************************/");
                    System.out.println("/****     Triangulo    ****/");
                    System.out.println("/**************************/");
                    System.out.println("/* 1 - Cadastrar Triangulo  */");
                    System.out.println("/* 2 - Calcular Area      */");
                    System.out.println("/* 3 - Calcular Perimetro */");
                    //add a opção da validação do tipo
                    System.out.println("/* 4 - Qual o tipo do Triângulo? */");
                    //add a opção de validação se é retângulo
                    System.out.println("/* 5 - É retângulo ou não? */");
                    System.out.println("/* 6 - Sair               */");
                    System.out.println("/**************************/");
                    System.out.print("Informe a opção desejada: ");

                    int optionTriangulo = scanner.nextInt();

                    switch (optionTriangulo) {
                        case 1:
                            validaTriangulo = triangulo.cadastrarTriangulo();
                            break;
                        case 2:
                            if (validaTriangulo) triangulo.calcularArea();
                            else System.out.println("Cadastre um Triangulo!");
                            break;
                        case 3:
                            if (validaTriangulo) triangulo.calcularPerimetro();
                            else System.out.println("Cadastre um Triangulo!");
                            break;
                        case 4:
                            if (validaTriangulo) triangulo.definirTipo();
                            else System.out.println("Cadastre um Triangulo!");
                            break;
                        case 5:
                            if (validaTriangulo) triangulo.validarTrianguloRet();
                            else System.out.println("Cadastre um Triangulo!");
                            break;
                        case 6:
                            System.out.println("Saindo Triangulo...");
                            exitTriangulo = true;
                            break;
                        default:
                            System.out.println("Escolha uma opção válida...");
                    }
                }
            }
        }
