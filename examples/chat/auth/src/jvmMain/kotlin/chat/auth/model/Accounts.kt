package chat.auth.model

import com.varabyte.kobweb.api.InitApi
import com.varabyte.kobweb.api.InitApiContext
import com.varabyte.kobweb.api.data.add
import chat.auth.model.auth.Account

@InitApi
fun initAccounts(ctx: InitApiContext) {
    ctx.data.add(Accounts())
}

class Accounts {
    val set = mutableSetOf<Account>()
}