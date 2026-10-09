fun main() {
    val senhaCorreta = "N3tw0rk_2077"
    val forcaSenha = 85
    val ramDisponivel = 65

    var tentativas = 0
    val maxTentativas = 3
    var acessoConcedido = false

    println("===  FIREWALL CORPORATIVO — NIGHT CITY NETWORKS  ===")
    println("Sistema de segurança ativado. Tentativas restantes: $maxTentativas")
    println("Deck do hacker — RAM disponível: ${ramDisponivel}GB\n")

    while (tentativas < maxTentativas && !acessoConcedido) {
        println("--- Tentativa ${tentativas + 1} de $maxTentativas ---")

        print("Digite a senha: ")
        val entradaUsuario: String? = readLine()
        val senhaDigitada = entradaUsuario ?: ""
        if (entradaUsuario == null) {
            println("⚠️  Comando inválido ou vazio! Nada foi enviado.")
            tentativas++
            continue
        }

        if (senhaDigitada == senhaCorreta) {
            println("\n✅ SENHA CORRETA! Calculando viabilidade de invasão...")

            if (forcaSenha > ramDisponivel) {
                println("⚠️  Senha muito forte! (Nível: $forcaSenha)")
                println("💻 RAM insuficiente para descriptografia. (Seu deck: $ramDisponivel GB)")
                println("🔒 Acesso PARCIAL — Dados criptografados demais para extrair.")
            } else {
                println("⚡ Recursos suficientes! Decodificando protocolo...")
                println("✅ ACESSO CONCEDIDO — Bem-vindo à rede da Arasaka!")
                acessoConcedido = true
            }
        } else {
            println("❌ Senha incorreta!")
            tentativas++
        }
        println()
    }
    
    if (!acessoConcedido) {
        println("🚫 BLOQUEADO — Limite de $maxTentativas tentativas atingido.")
        println("🔔 Alerta enviado para a segurança corporativa. Fuja se for possivel!")
    }
}
