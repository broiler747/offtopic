require: offtopic.sc
    module = offtopic

theme: /

    state: You
        q!: * $you *
        a: Я понял, что вы ко мне обратились, но не понял, зачем.

    state: CatchAll
        q!: *
        a: Извините, я вас не понял.