package com.encriptadordetexto.encriptador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String encryptedText = encrypt("Buracos Negros: O Mistério do Cosmos\n" + //
                "\n" + //
                "Os buracos negros são uma das entidades mais enigmáticas do universo, desafiando as leis da física e nossa compreensão do cosmos. Eles são regiões do espaço-tempo onde a gravidade é tão intensa que nada, nem mesmo a luz, pode escapar. A ideia de um buraco negro surgiu no século XVIII, mas foi a teoria da relatividade geral de Albert Einstein, proposta em 1915, que forneceu a base teórica para sua existência.\n"
                + //
                "\n" + //
                "Um buraco negro é formado quando uma estrela massiva atinge o fim de sua vida e colapsa sob sua própria gravidade. Durante esse processo, o núcleo da estrela se comprime, e a gravidade se torna tão forte que cria uma \"curvatura\" extrema no espaço-tempo. O ponto central dessa curvatura é chamado de singularidade, onde as leis conhecidas da física deixam de funcionar.\n"
                + //
                "\n" + //
                "A região ao redor da singularidade, onde a gravidade é tão forte que nada pode escapar, é conhecida como o horizonte de eventos. Qualquer objeto ou radiação que cruzar esse limite não pode mais voltar, tornando o buraco negro \"invisível\" para o observador externo.\n"
                + //
                "\n" + //
                "Existem diferentes tipos de buracos negros, classificados de acordo com sua massa: os buracos negros estelares, que são formados pela morte de estrelas massivas; os buracos negros supermassivos, encontrados no centro das galáxias, incluindo a nossa, a Via Láctea; e os buracos negros intermediários, cujas origens ainda são um mistério.\n"
                + //
                "\n" + //
                "Embora os buracos negros não possam ser observados diretamente, os cientistas podem estudar seu impacto no ambiente ao seu redor. Quando matéria é atraída para um buraco negro, ela pode formar um disco de acreção altamente energético, liberando radiação em forma de raios X. Esses discos de acreção são uma das principais maneiras pelas quais os astrônomos detectam buracos negros.\n"
                + //
                "\n" + //
                "Além disso, em 2019, um marco histórico foi alcançado com a captura da primeira imagem de um buraco negro, obtida pela colaboração do Event Horizon Telescope. A imagem revelou a sombra de um buraco negro supermassivo no centro da galáxia M87, oferecendo uma prova visual da teoria dos buracos negros.\n"
                + //
                "\n" + //
                "Apesar dos avanços, muitas perguntas permanecem. O que realmente acontece dentro de um buraco negro? A singularidade pode ser resolvida pela física quântica? Os buracos negros são uma chave para entender a natureza fundamental do espaço-tempo?\n"
                + //
                "\n" + //
                "Os buracos negros continuam a ser uma área de intensa pesquisa na astrofísica e na física teórica, desafiando nossas noções sobre a gravidade, o espaço e o tempo. Eles permanecem como um dos maiores mistérios do universo, com o potencial de revelar os segredos mais profundos do cosmos.");
        System.out.println("Texto encriptado: " + encryptedText);
    }

    public static String encrypt(String textToEncrypt) {
        String encryptedText = "";

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        List<Character> charactersList = new ArrayList(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'á', 'é', 'í', 'ó', 'ú', 'ã', 'õ', 'à', 'è', 'ì', 'ò', 'ù', 'â', 'ê', 'î', 'ô', 'û', 'ç', 'Á', 'É', 'Í',
                'Ó', 'Ú', 'Ã', 'Õ', 'À', 'È', 'Ì', 'Ò', 'Ù', 'Â', 'Ê', 'Î', 'Ô', 'Û', 'Ç', '!', '"', '#', '$', '%', '&',
                '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^',
                '_', '`', '{', '|', '}', '~', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'));
        for (Character character : charactersList) {
            map.put(character, charactersList.indexOf(character) + 1);
        }

        String textWithoutSpace = textToEncrypt.replaceAll("\\s+", "");
        char[] textWithoutSpaceAsArray = textWithoutSpace.toCharArray();
        for (char character : textWithoutSpaceAsArray) {
            encryptedText = encryptedText + Integer.toString(map.get(character));
        }

        return encryptedText;
    }
}