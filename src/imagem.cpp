#include "imagem.hpp"
#include <iostream>
#include <string>
#include <fstream>
//#include <stdlib.h>

using namespace std;

Imagem::Imagem(){
	cout << "construtor de Imagem" << endl;
	string arquivo = "";
	string camArquivo = "";
}

Imagem::~Imagem(){
	cout << "Destrutor de Imagem" << endl;
}



void Imagem::setArquivo(string arquivo){
	this->arquivo = arquivo;
	camArquivo = "./imagens/" + arquivo;
}

string Imagem::getArquivo(){
	return this->arquivo;
}

string Imagem::getCamArquivo(){
	return camArquivo;
}



void Imagem::abrirArquivo(){

	arquivoFile.open(camArquivo,ios::binary);
}


void Imagem::lerArquivo(){

	string inicioCrip,tamCrip,cifra,tipo;
	char comentario,copia[10000000];
	int i=1;


	getline(arquivoFile,tipo,'\n');
	arquivoFile.get(comentario);
	getline(arquivoFile,inicioCrip,' ');
	getline(arquivoFile,tamCrip,' ');
	getline(arquivoFile,cifra,'\n');

	ofstream arquivoSaida;
	arquivoSaida.open("./imagens/jose.pgm");

	ofstream arquivoDaCrip;
	arquivoDaCrip.open("./imagens/crip.txt");

	arquivoSaida << tipo << endl;
	arquivoSaida << comentario << inicioCrip << " " << tamCrip << " " << cifra << endl;
/*
	int jose;
	string teste = "56";
	jose = stoi(inicioCrip);
	cout << jose << endl;

*/
	while(!arquivoFile.eof()){
		
		arquivoFile.get(copia[i]);

		//cout << (int)copia[i];
		arquivoSaida << copia[i];
		i++;
		
		if(i==stoi(inicioCrip)){
			arquivoDaCrip << copia[i];
			
			int inicioCripInt,tamCripInt;
			inicioCripInt = stoi(inicioCrip);
			tamCripInt = stoi(tamCrip);



			for(i=inicioCripInt; i<=(inicioCripInt+tamCripInt); i++){
				arquivoFile.get(copia[i]);
			
				arquivoSaida << copia[i];
				arquivoDaCrip << copia[i];
			}
		}
		
	}
	cout << endl;

}
