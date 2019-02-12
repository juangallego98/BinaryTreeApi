# BinaryTreeApi

URI PARA CREAR UN ARBOL BINARIO Y ENCONTRAR EL ANCESTRO COMÚN MÀS CERCANO. 
http://localhost:8080/LCA/Api/services/ancestor

JSON QUE CONTIENE LOS VALORES PARA CREAR UN ARBOL BINARIO Y LOS NODOS DE LOS CUALES SE DESEA ENCONTRAR EL ANCESTRO COMÙN MÀS CERCANO:
{
  "Tree": [
      "70",
      "84",
      "85",
      "78",
      "80",
      "76",
      "49",
      "37",
      "54",
      "22",
      "40",
      "51"
  ],
  "Nodes": [
      "40",
      "78"
  ]
}


--------------------------------------------------------

URI PARA CREAR UN ARBOL BINARIO: 
http://localhost:8080/LCA/Api/services/build

JSON QUE CONTIENE LOS VALORES PARA CREAR UN ARBOL BINARIO:
{
  "Tree": [
      "70",
      "84",
      "85",
      "78",
      "80",
      "76",
      "49",
      "37",
      "54",
      "22",
      "40",
      "51"
  ]
}
