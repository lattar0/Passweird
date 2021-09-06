import React from 'react';
import { View } from 'react-native';
import { theme } from '../../styles/theme';
import { styles } from './styles';
import { ButtonFooter } from '../ButtonFooter';

import { useNavigation } from '@react-navigation/core';

export function Footer() {
  const navigation = useNavigation();

  return (
    <View style={styles.footer}>
      <ButtonFooter color={theme.colors.blue} icon="lock" text="Passwords" onPress={() => navigation.navigate('Passwords') } />

      <ButtonFooter color={theme.colors.gray} icon="camera" text="Gallery" onPress={() => navigation.navigate('Gallery') } />

      <ButtonFooter color={theme.colors.gray} icon="book" text="Notes" onPress={() => navigation.navigate('Notes') }/>
    </View>
  );
}

