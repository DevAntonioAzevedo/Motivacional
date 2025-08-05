package com.example.motivacional

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.motivacional.databinding.ActivityMainBinding
import kotlin.random.Random

/**
 * Projeto: Frases Motivacionais
 * Auto: Antonio Azevedo
 * Contato: antonio_azevedo@hotmail.com.br
 * Data de Criação: 01/08/2025
 *
 * Objetivo do projeto:
 * - Inflar o layout `activity_main.xml` usando View Binding.
 * - Adaptar a interface do usuario as insets do sistema (edge-to-edge).
 * - Gerenciar a logica para resgatar frases do array de strings.
 * - Manipular elementos da UI (Button e Textview) para exibir resultado na tela.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Infla o layout `activity_main.xml` e obtendo auma instancia de `ActivityMainBinding`.
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura um listener para aplicar isents de janela, e evitar que o conteudo seja
        // sobreposto pela barra de status e navegacao do sistema.
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtem o array de frases motivacionais do arquivo de recursos (strings.xml).
        val lista = resources.getStringArray(R.array.frases_motivacionais)

        /**
         * Define um listener de clique para o botao `btnGenerator`.
         * A cada clique, uma frase aleatoria do array eh selecionada e exibida.
          */

        binding.btnGenerator.setOnClickListener {
            // Gera um indice aleatorio dentro do tamanho do array `lista`.
            val indice = Random.nextInt(lista.size)
            // Atualiza o TextView `txtResult` com a frase correspondente ao indice sorteado.
            binding.txtResult.text = lista[indice]
        }
    }
}