FROM yongjhih/android
#FROM yongjhih/alpine-android

ENV UID=${UID:-1001}
RUN useradd -m -s /bin/bash -u $UID app # UID
RUN echo "app ALL=(ALL)   NOPASSWD: ALL" >> /etc/sudoers

USER app

WORKDIR /code
