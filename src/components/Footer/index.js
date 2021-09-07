import React from 'react';
import { View } from 'react-native';
import { styles } from './styles';
import { ButtonFooter } from '../ButtonFooter';

export function Footer() {
  return (
    <View style={styles.footer}>
      <ButtonFooter icon="lock" text="Passwords" goTo="Passwords" />

      <ButtonFooter icon="camera" text="Gallery" goTo="Gallery" />

      <ButtonFooter icon="book" text="Notes" goTo="Notes" />
    </View>
  );
}

